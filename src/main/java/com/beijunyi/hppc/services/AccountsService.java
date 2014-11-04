package com.beijunyi.hppc.services;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import com.beijunyi.hppc.dao.AccountDao;
import com.beijunyi.hppc.models.admin.Account;
import com.beijunyi.hppc.models.admin.CreateAccountRequest;
import com.beijunyi.hppc.models.admin.ModifyPasswordRequest;
import com.beijunyi.hppc.models.internal.QueryRequest;
import com.beijunyi.hppc.models.internal.QueryResult;
import org.jasypt.util.password.PasswordEncryptor;

@Named
@Singleton
public class AccountsService {

  private final AccountDao ad;
  private final PasswordEncryptor pe;

  @Inject
  public AccountsService(@Nonnull AccountDao ad, @Nonnull PasswordEncryptor pe) {
    this.ad = ad;
    this.pe = pe;
  }

  @Nonnull
  @Transactional
  public QueryResult<Account> query(@Nonnull QueryRequest request) {
    return ad.query(request);
  }

  @Nonnull
  @Transactional
  public Account createAccount(@Nonnull CreateAccountRequest request) {
    if(request.getUsername() == null)
      throw new IllegalArgumentException("Missing username");

    if(request.getPassword() == null)
      throw new IllegalArgumentException("Missing password");

    if(request.getAdmin() == null)
      throw new IllegalArgumentException("Missing admin");

    Account account = new Account(request.getUsername(), pe.encryptPassword(request.getPassword()), request.getAdmin());
    ad.persist(account);
    return account;
  }

  @Nonnull
  @Transactional
  public Account updateBasicInfo(@Nonnull Account account) {
    if(account.getId() == null)
      throw new IllegalArgumentException("Missing account id");
    Account toUpdate = ad.get(account.getId());
    if(toUpdate == null)
      throw new IllegalArgumentException("Cannot find account with id = \"" + account.getId() + "\"");
    toUpdate.setUsername(account.getUsername());
    toUpdate.setAlias(account.getAlias());
    toUpdate.setActive(account.getActive());
    toUpdate.setActive(account.getActive());
    ad.update(toUpdate);
    return toUpdate;
  }

  @Nonnull
  @Transactional
  public Account modifyPassword(@Nonnull ModifyPasswordRequest request, @Nonnull Account author, boolean checkOldPassword) {
    if(request.getId() == null)
      throw new IllegalArgumentException("Missing account id");

    Account account = ad.get(request.getId());
    if(account == null)
      throw new IllegalArgumentException("Cannot find account with id = \"" + request.getId() + "\"");

    if(author.getId() == null)
      throw new IllegalStateException("Unrecognized author");

    if(checkOldPassword) {
      if(!author.getId().equals(request.getId()))
        throw new IllegalArgumentException("Illegal target account ID");

      if(request.getOldPassword() == null)
        throw new IllegalArgumentException("Missing old password");

      if(!pe.checkPassword(request.getOldPassword(), account.getPassword()))
        throw new IllegalArgumentException("Incorrect password");
    }

    if(request.getNewPassword() == null)
      throw new IllegalArgumentException("Missing new password");

    account.setPassword(pe.encryptPassword(request.getNewPassword()));
    ad.update(account);
    return account;
  }

}
