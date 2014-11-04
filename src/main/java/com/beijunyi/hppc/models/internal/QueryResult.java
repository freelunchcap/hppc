package com.beijunyi.hppc.models.internal;

import java.util.List;
import javax.annotation.Nonnull;

public final class QueryResult<T> {
  private final String qid;
  private final long total;
  private final List<T> data;

  public QueryResult(@Nonnull String qid, long total, @Nonnull List<T> data) {
    this.qid = qid;
    this.total = total;
    this.data = data;
  }

  @Nonnull
  public String getQid() {
    return qid;
  }

  public long getTotal() {
    return total;
  }

  @Nonnull
  public List<T> getData() {
    return data;
  }
}
