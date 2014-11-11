package com.beijunyi.hppc.dao;

import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.beijunyi.hppc.models.internal.QueryRequest;
import com.beijunyi.hppc.models.internal.QueryResult;

public interface Dao<T> {

  @Nonnull
  List<T> listAll();

  @Nonnull
  List<T> listBy(@Nonnull String key, @Nonnull Object value);

  @Nonnull
  List<T> listBy(@Nonnull Map<String, Object> properties);

  @Nullable
  T get(int id);

  @Nullable
  T getBy(@Nonnull String key, @Nonnull Object value);

  @Nullable
  T getBy(@Nonnull Map<String, Object> properties);

  @Nonnull
  QueryResult<T> query(@Nonnull QueryRequest request);

  T persist(@Nonnull T entry);

  T merge(@Nonnull T entry);

  T delete(int id);

  T delete(@Nonnull T entry);

}