package com.beijunyi.hppc.security;

import java.util.Collection;
import java.util.HashSet;
import javax.annotation.Nonnull;

import com.beijunyi.hppc.models.data.system.Account;
import com.beijunyi.hppc.models.data.system.Privilege;
import com.beijunyi.hppc.models.data.system.Role;
import org.springframework.security.core.GrantedAuthority;

public final class AccountUser extends AuthorizedUser {

  private final Account account;

  public AccountUser(Account account, String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, @Nonnull Collection<? extends GrantedAuthority> authorities) {
    super(resolvePrivileges(account), username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    this.account = account;
  }

  private static Collection<Privilege> resolvePrivileges(@Nonnull Account account) {
    Collection<Privilege> ps = new HashSet<>();
    if(account.getRoles() != null) {
      for(Role r : account.getRoles()) {
        if(r.getPrivileges() != null)
        for(Privilege p : r.getPrivileges()) {
          ps.add(p);
        }
      }
    }

    return ps;
  }

  @Nonnull
  public Account getAccount() {
    return account;
  }
}
