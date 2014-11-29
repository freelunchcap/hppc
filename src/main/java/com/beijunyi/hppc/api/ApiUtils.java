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
  private static final String MATCH_PREFIX_TOKEN = "match-";
  private static final String CONTAIN_PREFIX_TOKEN = "contain-";
  private static final String GREATER_PREFIX_TOKEN = "gt-";
  private static final String LESS_PREFIX_TOKEN = "lt-";

  @Nonnull
  public static QueryRequest getRequest(@Nonnull UriInfo uriInfo) {
    Map<String, List<String>> params = uriInfo.getQueryParameters();
    Integer from = null;
    Integer size = null;
    String sortKey = null;
    String sortDir = null;
    Boolean findTotal = null;
    Map<String, String> matchMap = new HashMap<>();
    Map<String, String> containMap = new HashMap<>();
    Map<String, String> gtMap = new HashMap<>();
    Map<String, String> ltMap = new HashMap<>();
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
      } else if(paramKey.startsWith(MATCH_PREFIX_TOKEN)) {
        String key = paramKey.substring(MATCH_PREFIX_TOKEN.length());
        matchMap.put(key, paramValue);
      } else if(paramKey.startsWith(CONTAIN_PREFIX_TOKEN)) {
        String key = paramKey.substring(CONTAIN_PREFIX_TOKEN.length());
        containMap.put(key, paramValue);
      } else if(paramKey.startsWith(GREATER_PREFIX_TOKEN)) {
        String key = paramKey.substring(GREATER_PREFIX_TOKEN.length());
        gtMap.put(key, paramValue);
      }else if(paramKey.startsWith(LESS_PREFIX_TOKEN)) {
        String key = paramKey.substring(LESS_PREFIX_TOKEN.length());
        ltMap.put(key, paramValue);
      }
    }
    return  new QueryRequest(from, size, sortKey, sortDir, findTotal, matchMap, containMap, gtMap, ltMap);
  }

}
