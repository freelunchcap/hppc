package com.beijunyi.hppc.dao;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.PostConstruct;

import com.beijunyi.hppc.models.internal.QueryRequest;
import com.beijunyi.hppc.models.internal.QueryResult;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;

public abstract class AbstractDao<T> implements Dao<T> {

  protected SessionFactory sf;
  protected Map<String, Class> fieldClassMap = new HashMap<>();

  protected AbstractDao(@Nonnull SessionFactory sf) {
    this.sf = sf;
    fieldClassMap = createFieldClassMap();
  }

  @Nonnull
  protected abstract Class<T> getPersistentClass();

  @Nonnull
  protected Map<String, Class> createFieldClassMap() {
    Class<T> clazz = getPersistentClass();
    Map<String, Class> result = new HashMap<>();
    for(Field field : clazz.getDeclaredFields()) {
      Class fieldClass = field.getType();
      if(fieldClass == String.class)
        continue;
      String fieldName = field.getName();
      result.put(fieldName, fieldClass);
    }
    return result;
  }

  @Nonnull
  @Override
  @SuppressWarnings("unchecked")
  public List<T> listAll() {
    return sf.getCurrentSession()
             .createCriteria(getPersistentClass())
             .list();
  }

  @Nonnull
  @Override
  @SuppressWarnings("unchecked")
  public List<T> listBy(@Nonnull String key, @Nonnull Object value) {
    return sf.getCurrentSession()
             .createCriteria(getPersistentClass())
             .add(Restrictions.eq(key, value))
             .list();
  }

  @Nonnull
  @Override
  @SuppressWarnings("unchecked")
  public List<T> listBy(@Nonnull Map<String, Object> properties) {
    return sf.getCurrentSession()
             .createCriteria(getPersistentClass())
             .add(Restrictions.allEq(properties))
             .list();
  }

  @Nullable
  @Override
  @SuppressWarnings("unchecked")
  public T get(int id) {
    return (T) sf.getCurrentSession()
                 .createCriteria(getPersistentClass())
                 .add(Restrictions.idEq(id))
                 .uniqueResult();
  }

  @Nullable
  @Override
  @SuppressWarnings("unchecked")
  public T getBy(@Nonnull String key, @Nonnull Object value) {
    return (T) sf.getCurrentSession()
                 .createCriteria(getPersistentClass())
                 .add(Restrictions.eq(key, value))
                 .uniqueResult();
  }

  @Nullable
  @Override
  @SuppressWarnings("unchecked")
  public T getBy(@Nonnull Map<String, Object> properties) {
    return (T) sf.getCurrentSession()
                 .createCriteria(getPersistentClass())
                 .add(Restrictions.allEq(properties))
                 .uniqueResult();
  }

  @Nonnull
  protected Object castValue(@Nonnull String key, @Nonnull String value) {
    Class<?> fieldClass = fieldClassMap.get(key);
    if(fieldClass == null)
      return value;
    try {
      return fieldClass.getMethod("valueOf", String.class).invoke(null, value);
    } catch(Exception e) {
      throw new RuntimeException("cannot cast " + value + " to " + fieldClass.getName());
    }
  }

  @Nonnull
  @SuppressWarnings("unchecked")
  protected QueryResult<T> criterionQuery(@Nonnull QueryRequest request, @Nonnull Criterion... criterion) {
    Criteria dataCriteria = sf.getCurrentSession()
                              .createCriteria(getPersistentClass());
    Criteria totalCriteria = sf.getCurrentSession()
                               .createCriteria(getPersistentClass())
                               .setProjection(Projections.rowCount());

    Conjunction conj = Restrictions.conjunction();
    dataCriteria.add(conj);
    totalCriteria.add(conj);

    for(Map.Entry<String, String> match : request.getMatchMap().entrySet()) {
      conj.add(Restrictions.eq(match.getKey(), castValue(match.getKey(), match.getValue())));
    }

    for(Map.Entry<String, String> contain : request.getContainMap().entrySet()) {
      conj.add(Restrictions.ilike(contain.getKey(), "%" + contain.getValue() + "%"));
    }

    for(Map.Entry<String, String> gt : request.getGtMap().entrySet()) {
      conj.add(Restrictions.gt(gt.getKey(), castValue(gt.getKey(), gt.getValue())));
    }

    for(Map.Entry<String, String> lt : request.getLtMap().entrySet()) {
      conj.add(Restrictions.gt(lt.getKey(), castValue(lt.getKey(), lt.getValue())));
    }

    for(Criterion c : criterion) {
      dataCriteria.add(c);
      totalCriteria.add(c);
    }

    if(request.getFrom() != null)
      dataCriteria.setFirstResult(request.getFrom());
    if(request.getSize() != null)
      dataCriteria.setMaxResults(request.getSize());
    if(request.getSortDir() != null && request.getSortKey() != null) {
      if(request.getSortDir().equalsIgnoreCase("asc"))
        dataCriteria.addOrder(Order.asc(request.getSortKey()));
      else if(request.getSortDir().equalsIgnoreCase("desc"))
        dataCriteria.addOrder(Order.desc(request.getSortKey()));
    }

    long total = -1;
    if(request.getFindTotal() == null || request.getFindTotal())
      total = (long) totalCriteria.uniqueResult();

    return new QueryResult<>(total, (List<T>) dataCriteria.list());
  }

  @Nonnull
  @Override
  @SuppressWarnings("unchecked")
  public QueryResult<T> query(@Nonnull QueryRequest request) {
    return criterionQuery(request);
  }

  @Nonnull
  @Override
  public T save(@Nonnull T entry) {
    Session session = sf.getCurrentSession();
    session.merge(entry);
    session.flush();
    return entry;
  }

  @Override
  @SuppressWarnings("unchecked")
  public void delete(int id) {
    Session session = sf.getCurrentSession();
    T entry = (T)session.load(getPersistentClass(), id);
    delete(entry);
  }

  @Override
  public void delete(@Nonnull T entry) {
    Session session = sf.getCurrentSession();
    session.delete(entry);
    session.flush();
  }

  @Nonnull
  @Override
  @SuppressWarnings("unchecked")
  public T create(@Nonnull T entry) {
    Session session = sf.getCurrentSession();
    session.save(entry);
    return entry;
  }

  @Nonnull
  @Override
  public T update(@Nonnull T entry) {
    Session session = sf.getCurrentSession();
    session.update(entry);
    return entry;
  }
}
