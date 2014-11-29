package com.beijunyi.hppc.models.internal;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class QueryRequest {
  private final Integer from;
  private final Integer size;
  private final String sortKey;
  private final String sortDir;
  private final Boolean findTotal;
  private final Map<String, String> matchMap;
  private final Map<String, String> containMap;
  private final Map<String, String> gtMap;
  private final Map<String, String> ltMap;

  public QueryRequest(@Nullable Integer from, @Nullable Integer size, @Nullable String sortKey, @Nullable String sortDir, @Nullable Boolean findTotal, @Nonnull Map<String, String> matchMap, @Nonnull Map<String, String> containMap, @Nonnull Map<String, String> gtMap, @Nonnull Map<String, String> ltMap) {
    this.from = from;
    this.size = size;
    this.sortKey = sortKey;
    this.sortDir = sortDir;
    this.findTotal = findTotal;
    this.matchMap = matchMap;
    this.containMap = containMap;
    this.gtMap = gtMap;
    this.ltMap = ltMap;
  }

  @Nullable
  public Integer getFrom() {
    return from;
  }

  @Nullable
  public Integer getSize() {
    return size;
  }

  @Nullable
  public String getSortKey() {
    return sortKey;
  }

  @Nullable
  public String getSortDir() {
    return sortDir;
  }

  @Nullable
  public Boolean getFindTotal() {
    return findTotal;
  }

  @Nonnull
  public Map<String, String> getMatchMap() {
    return matchMap;
  }

  @Nonnull
  public Map<String, String> getContainMap() {
    return containMap;
  }

  @Nonnull
  public Map<String, String> getGtMap() {
    return gtMap;
  }

  @Nonnull
  public Map<String, String> getLtMap() {
    return ltMap;
  }
}
