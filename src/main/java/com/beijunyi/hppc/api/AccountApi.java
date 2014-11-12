package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import com.beijunyi.hppc.models.data.admin.Account;
import com.beijunyi.hppc.services.AccountService;

@Named
@Singleton
@Path("/api/account")
public class AccountApi extends DataApi<Account> {

  @Inject
  public AccountApi(@Nonnull AccountService service) {
    super(service);
  }

}
