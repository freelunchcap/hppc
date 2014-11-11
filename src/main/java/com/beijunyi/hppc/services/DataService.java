package com.beijunyi.hppc.services;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.internal.QueryRequest;
import com.beijunyi.hppc.models.internal.QueryResult;

public abstract class DataService<T> {

  protected Dao<T> dao;

  public DataService(@Nonnull Dao<T> dao) {
    this.dao = dao;
  }

  @Nonnull
  public QueryResult<T> get(@Nonnull QueryRequest request) {
    return dao.query(request);
  }

  @Nonnull
  public T post(@Nonnull T obj) {
    dao.persist(obj);
    return obj;
  }

  @Nullable
  public T get(int id) {
    return dao.get(id);
  }

  @Nonnull
  public T put(@Nonnull T obj) {
    return dao.merge(obj);
  }

  @Nonnull
  public T delete(int id) {
    return dao.delete(id);
  }

}
