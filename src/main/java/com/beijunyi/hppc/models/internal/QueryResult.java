package com.beijunyi.hppc.models.internal;

import java.util.List;
import javax.annotation.Nonnull;

public final class QueryResult<T> {
  private final long total;
  private final List<T> data;

  public QueryResult(long total, @Nonnull List<T> data) {
    this.total = total;
    this.data = data;
  }

  public long getTotal() {
    return total;
  }

  @Nonnull
  public List<T> getData() {
    return data;
  }
}
