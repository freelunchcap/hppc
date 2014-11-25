package com.beijunyi.hppc.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.ws.rs.core.UriInfo;

import com.beijunyi.hppc.models.internal.QueryRequest;

public class ApiUtils {

  private static final String FROM_TOKEN = "from";
  private static final String SIZE_TOKEN = "size";
  private static final String SORT_KEY_TOKEN = "sort-key";
  private static final String SORT_DIR_TOKEN = "sort-dir";
  private static final String FIND_TOTAL_TOKEN = "find-total";
  private static final String FILTER_PREFIX_TOKEN = "filter-";

  @Nonnull
  public static QueryRequest getRequest(@Nonnull UriInfo uriInfo) {
    Map<String, List<String>> params = uriInfo.getQueryParameters();
    Integer from = null;
    Integer size = null;
    String sortKey = null;
    String sortDir = null;
    Boolean findTotal = null;
    Map<String, String> filters = new HashMap<>();
    for(Map.Entry<String, List<String>> paramPair : params.entrySet()) {
      String paramKey = paramPair.getKey();
      String paramValue = paramPair.getValue().get(0);
      if(paramKey.equals(FROM_TOKEN)) {
        from = Integer.valueOf(paramValue);
      } else if(paramKey.equals(SIZE_TOKEN)) {
        size = Integer.valueOf(paramValue);
      } else if(paramKey.equals(SORT_KEY_TOKEN)) {
        sortKey = paramValue;
      } else if(paramKey.equals(SORT_DIR_TOKEN)) {
        sortDir = paramValue;
      } else if(paramKey.equals(FIND_TOTAL_TOKEN)) {
        findTotal = Boolean.valueOf(paramValue);
      } else if(paramKey.startsWith(FILTER_PREFIX_TOKEN)) {
        String filterKey = paramKey.substring(FILTER_PREFIX_TOKEN.length());
        filters.put(filterKey, paramValue);
      }
    }
    return  new QueryRequest(from, size, sortKey, sortDir, findTotal, filters);
  }

}
