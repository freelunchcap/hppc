package com.beijunyi.hppc.security;

import java.util.Collection;
import javax.annotation.Nonnull;

import com.beijunyi.hppc.models.data.admin.Privilege;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class AuthorizedUser extends User {

  private final Collection<Privilege> privileges;

  public AuthorizedUser(@Nonnull Collection<Privilege> privileges, @Nonnull String username, @Nonnull String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, @Nonnull Collection<? extends GrantedAuthority> authorities) {
    super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    this.privileges = privileges;
  }

  @Nonnull
  public Collection<Privilege> getPrivileges() {
    return privileges;
  }
}
