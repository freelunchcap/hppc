package com.beijunyi.hppc.services;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import com.beijunyi.hppc.dao.AccountDao;
import com.beijunyi.hppc.models.data.admin.Account;
import org.jasypt.util.password.PasswordEncryptor;

@Named
@Singleton
public class AccountsService extends DataService<Account> {

  private final PasswordEncryptor pe;

  @Inject
  public AccountsService(@Nonnull AccountDao ad, @Nonnull PasswordEncryptor pe) {
    super(ad);
    this.pe = pe;
  }

  @Nonnull
  @Override
  @Transactional
  public Account save(@Nonnull Account account) {
    if(account.getEncrypted() == null)
      throw new IllegalArgumentException("encrypted is null");
    if(account.getPassword() == null)
      throw new IllegalArgumentException("password is null");
    if(!account.getEncrypted()) {
      String encryptedPassword = pe.encryptPassword(account.getPassword());
      account.setPassword(encryptedPassword);
      account.setEncrypted(true);
    }
    return super.save(account);
  }
}
