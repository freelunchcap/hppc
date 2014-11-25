package com.beijunyi.hppc.models.internal;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class QueryRequest {
  private Integer from;
  private Integer size;
  private String sortKey;
  private String sortDir;
  private Boolean findTotal;
  private Map<String, String> filters;

  public QueryRequest(@Nullable Integer from, @Nullable Integer size, @Nullable String sortKey, @Nullable String sortDir, @Nullable Boolean findTotal, @Nullable Map<String, String> filters) {
    this.from = from;
    this.size = size;
    this.sortKey = sortKey;
    this.sortDir = sortDir;
    this.findTotal = findTotal;
    this.filters = filters;
  }

  @Nullable
  public Integer getFrom() {
    return from;
  }

  public void setFrom(@Nullable Integer from) {
    this.from = from;
  }

  @Nullable
  public Integer getSize() {
    return size;
  }

  public void setSize(@Nullable Integer size) {
    this.size = size;
  }

  @Nullable
  public String getSortKey() {
    return sortKey;
  }

  public void setSortKey(@Nullable String sortKey) {
    this.sortKey = sortKey;
  }

  @Nullable
  public String getSortDir() {
    return sortDir;
  }

  public void setSortDir(@Nullable String sortDir) {
    this.sortDir = sortDir;
  }

  @Nullable
  public Boolean getFindTotal() {
    return findTotal;
  }

  public void setFindTotal(@Nullable Boolean findTotal) {
    this.findTotal = findTotal;
  }

  @Nullable
  public Map<String, String> getFilters() {
    return filters;
  }

  public void setFilters(@Nullable Map<String, String> filters) {
    this.filters = filters;
  }
}
