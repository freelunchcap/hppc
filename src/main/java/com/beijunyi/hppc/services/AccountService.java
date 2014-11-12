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
public class AccountService extends DataService<Account> {

  @Inject
  public AccountService(@Nonnull AccountDao ad) {
    super(ad);
  }

}
