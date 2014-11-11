package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.beijunyi.hppc.models.data.admin.Account;

public interface AccountDao extends Dao<Account> {

  @Nullable
  Account findByUsername(@Nonnull String username);

}
