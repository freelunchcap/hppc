package com.beijunyi.hppc.security;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.AccountDao;
import com.beijunyi.hppc.models.admin.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

@Named
@Singleton
public class DatabaseUserDetailsService implements UserDetailsService {

  private final AccountDao ad;

  @Inject
  public DatabaseUserDetailsService(@Nonnull AccountDao ad) {
    this.ad = ad;
  }

  @Override
  @Transactional
  public UserDetails loadUserByUsername(@Nonnull String username) throws UsernameNotFoundException {
    Account account = ad.findByUsername(username);

    if(account == null)
      throw new UsernameNotFoundException("Could not find user " + username);

    Set<GrantedAuthority> gas = new HashSet<>();
    gas.add(SitePrivilege.ROLE_STAFF);

    assert account.getAdmin() != null;
    if(account.getAdmin())
      gas.add(SitePrivilege.ROLE_ADMIN);

    assert account.getUsername() != null;
    assert account.getPassword() != null;
    assert account.getActive() != null;

    return new AccountUser(account, account.getUsername(), account.getPassword(), true, true, true, account.getActive(), gas);
  }
}
