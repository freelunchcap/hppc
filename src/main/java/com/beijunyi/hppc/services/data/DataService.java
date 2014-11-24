package com.beijunyi.hppc.services.data;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.transaction.Transactional;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.internal.QueryRequest;
import com.beijunyi.hppc.models.internal.QueryResult;

public abstract class DataService<T> {

  protected Dao<T> dao;

  public DataService(@Nonnull Dao<T> dao) {
    this.dao = dao;
  }

  @Nonnull
  @Transactional
  public QueryResult<T> query(@Nonnull QueryRequest request) {
    return dao.query(request);
  }

  @Nonnull
  @Transactional
  public T save(@Nonnull T obj) {
    dao.save(obj);
    return obj;
  }

  @Nullable
  @Transactional
  public T get(int id) {
    return dao.get(id);
  }

  @Nonnull
  @Transactional
  public T delete(int id) {
    return dao.delete(id);
  }

}
