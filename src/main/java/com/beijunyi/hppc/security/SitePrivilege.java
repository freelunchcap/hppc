package com.beijunyi.hppc.security;

import org.springframework.security.core.GrantedAuthority;

public enum SitePrivilege implements GrantedAuthority {
  ROLE_STAFF,
  ROLE_ADMIN;

  @Override
  public String getAuthority() {
    return name();
  }

}
