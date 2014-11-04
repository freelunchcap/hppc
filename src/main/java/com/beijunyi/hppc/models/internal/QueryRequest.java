package com.beijunyi.hppc.models.internal;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class QueryRequest {
  private String qid;
  private Integer from;
  private Integer size;
  private String sortKey;
  private String sortDir;
  private Map<String, Object> filters;
  private String searchTerm;

  public QueryRequest(@Nonnull String qid, @Nullable Integer from, @Nullable Integer size, @Nullable String sortKey, @Nullable String sortDir, @Nullable Map<String, Object> filters, @Nullable String searchTerm) {
    this.qid = qid;
    this.from = from;
    this.size = size;
    this.sortKey = sortKey;
    this.sortDir = sortDir;
    this.filters = filters;
    this.searchTerm = searchTerm;
  }

  @Nonnull
  public String getQid() {
    return qid;
  }

  public void setQid(@Nullable String qid) {
    this.qid = qid;
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
  public Map<String, Object> getFilters() {
    return filters;
  }

  public void setFilters(@Nullable Map<String, Object> filters) {
    this.filters = filters;
  }

  @Nullable
  public String getSearchTerm() {
    return searchTerm;
  }

  public void setSearchTerm(@Nullable String searchTerm) {
    this.searchTerm = searchTerm;
  }
}
