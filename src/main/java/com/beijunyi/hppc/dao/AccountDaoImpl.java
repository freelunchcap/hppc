package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.admin.Account;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class AccountDaoImpl extends AbstractDao<Account> implements AccountDao {

  @Inject
  public AccountDaoImpl(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<Account> getPersistentClass() {
    return Account.class;
  }

  @Nullable
  @Override
  public Account findByUsername(@Nonnull String username) {
    return getBy("username", username);
  }
}
