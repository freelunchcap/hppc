package com.beijunyi.hppc.dao;

import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.beijunyi.hppc.models.internal.QueryRequest;
import com.beijunyi.hppc.models.internal.QueryResult;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;

public abstract class AbstractDao<T> implements Dao<T> {

  protected SessionFactory sf;

  protected AbstractDao(@Nonnull SessionFactory sf) {
    this.sf = sf;
  }

  @Nonnull
  protected abstract Class<T> getPersistentClass();

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
  @SuppressWarnings("unchecked")
  protected QueryResult<T> criterionQuery(@Nonnull QueryRequest request, @Nonnull Criterion... criterion) {
    Criteria dataCriteria = sf.getCurrentSession()
                              .createCriteria(getPersistentClass());
    Criteria totalCriteria = sf.getCurrentSession()
                               .createCriteria(getPersistentClass())
                               .setProjection(Projections.rowCount());

    if(request.getFilters() != null) {
      Conjunction conj = Restrictions.conjunction();
      for(Map.Entry<String, String> filter : request.getFilters().entrySet()) {
        conj.add(Restrictions.ilike(filter.getKey(), "%" + filter.getValue() + "%"));
      }
      dataCriteria.add(conj);
      totalCriteria.add(conj);
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
