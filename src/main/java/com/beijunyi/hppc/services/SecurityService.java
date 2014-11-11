package com.beijunyi.hppc.services;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.core.Response;

import com.beijunyi.hppc.models.data.admin.Account;
import com.beijunyi.hppc.models.data.admin.Privilege;
import com.beijunyi.hppc.models.web.LoginInformation;
import com.beijunyi.hppc.security.AccountUser;
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

  @Nullable
  public LoginInformation getLoginInformation() {
    AccountUser user = getCurrentUser();
    if(user == null)
      return null;
    Account account = user.getAccount();
    Set<Integer> privileges = new HashSet<>();
    for(Privilege privilege : user.getPrivileges()) {
      privileges.add(privilege.getId());
    }
    return new LoginInformation(account.getAlias(), account.getAdmin(), privileges);
  }

}
