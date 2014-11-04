package com.beijunyi.hppc.security;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Named
@Singleton
public class SecurityService {

  @Nullable
  public AccountUser getCurrentUser() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    if(authentication == null)
      return null;
    return (AccountUser) authentication.getPrincipal();
  }

}
