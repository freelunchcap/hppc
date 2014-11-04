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
      Criterion filterQuery = Restrictions.allEq(request.getFilters());
      dataCriteria.add(filterQuery);
      totalCriteria.add(filterQuery);
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

    return new QueryResult<>(request.getQid(), (long) totalCriteria.uniqueResult(), (List<T>) dataCriteria.list());
  }

  @Nonnull
  @Override
  @SuppressWarnings("unchecked")
  public QueryResult<T> query(@Nonnull QueryRequest request) {
    return criterionQuery(request);
  }

  @Override
  public void persist(@Nonnull T entry) {
    Session session = sf.getCurrentSession();
    session.persist(entry);
    session.flush();
  }

  @Override
  public void update(@Nonnull T entry) {
    Session session = sf.getCurrentSession();
    session.update(entry);
    session.flush();
  }

  @Override
  @SuppressWarnings("unchecked")
  public void delete(int id) {
    Session session = sf.getCurrentSession();
    delete((T)session.load(getPersistentClass(), id));
  }

  @Override
  public void delete(@Nonnull T entry) {
    Session session = sf.getCurrentSession();
    session.delete(entry);
    session.flush();
  }
}
