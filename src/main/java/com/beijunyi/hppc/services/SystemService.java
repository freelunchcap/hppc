package com.beijunyi.hppc.services;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import com.beijunyi.hppc.dao.AccountDao;
import com.beijunyi.hppc.dao.PrivilegeDao;
import com.beijunyi.hppc.dao.RoleDao;
import com.beijunyi.hppc.models.api.*;
import com.beijunyi.hppc.models.data.admin.Account;
import com.beijunyi.hppc.models.data.admin.Privilege;
import com.beijunyi.hppc.models.data.admin.Role;
import com.beijunyi.hppc.models.internal.QueryRequest;
import com.beijunyi.hppc.models.internal.QueryResult;
import org.jasypt.util.password.PasswordEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@Singleton
public class SystemService {

  private static final Logger log = LoggerFactory.getLogger(SystemService.class);

  @Inject
  private AccountDao ad;
  @Inject
  private RoleDao rd;
  @Inject
  private PrivilegeDao pd;
  @Inject
  private PasswordEncryptor pe;

  @Nonnull
  @Transactional
  public QueryResult<Account> queryAccounts(@Nonnull QueryRequest request) {
    return ad.query(request);
  }

  @Nonnull
  @Transactional
  public Account createAccount(@Nonnull UpdateAccountRequest request) {
    return ad.create(new Account(request.getUsername(), request.getAlias(), pe.encryptPassword(request.getPassword()), request.getAdmin()));
  }

  @Nonnull
  @Transactional
  public Account updateAccount(@Nonnull UpdateAccountRequest request) {
    if(request.getId() == null)
      throw new IllegalArgumentException("id is null");

    Account account = ad.get(request.getId());
    if(account == null)
      throw new RuntimeException("account not found: " + request.getId());

    account.setUsername(request.getUsername());
    account.setAlias(request.getAlias());
    account.setAdmin(request.getAdmin());
    account.setActive(request.getActive());

    return ad.update(account);
  }

  @Nonnull
  @Transactional
  public Account changeAccountPassword(@Nonnull ChangeAccountPasswordRequest request) {
    if(request.getId() == null)
      throw new IllegalArgumentException("id is null");

    Account account = ad.get(request.getId());
    if(account == null)
      throw new RuntimeException("account not found: " + request.getId());

    account.setPassword(pe.encryptPassword(request.getNewPassword()));

    return ad.update(account);
  }

  @Nonnull
  @Transactional
  public Account changeAccountRoleMapping(@Nonnull ChangeAccountRoleMappingRequest request) {
    if(request.getId() == null)
      throw new IllegalArgumentException("id is null");
    
    Account account = ad.get(request.getId());
    if(account == null)
      throw new RuntimeException("account not found: " + request.getId());
    
    if(request.getToAdd() != null) {
      for(int roleId : request.getToAdd()) {
        Role role = rd.get(roleId);
        if(role == null)
          throw new RuntimeException("role not found: " + roleId);

        assert account.getRoles() != null;
        if(!account.getRoles().add(role))
          log.warn("account " + account.getUsername() + " already has role " + role.getName());
      }
    }

    if(request.getToRemove() != null) {
      for(int roleId : request.getToAdd()) {
        Role role = rd.get(roleId);
        if(role == null)
          throw new RuntimeException("role not found: " + roleId);

        assert account.getRoles() != null;
        if(!account.getRoles().remove(role))
          log.warn("account " + account.getUsername() + " does not have role " + role.getName());
      }
    }

    return ad.update(account);
  }

  @Nonnull
  public QueryResult<Role> queryRoles(@Nonnull QueryRequest request) {
    return rd.query(request);
  }

  @Nonnull
  public Role createRole(@Nonnull UpdateRoleRequest request) {
    return rd.create(new Role(request.getName(), request.getDescription()));
  }

  @Nonnull
  public Role updateRole(@Nonnull UpdateRoleRequest request) {
    if(request.getId() == null)
      throw new IllegalArgumentException("id is null");

    Role role = rd.get(request.getId());
    if(role == null)
      throw new RuntimeException("role not found: " + request.getId());

    role.setName(request.getName());
    role.setDescription(request.getDescription());
    role.setActive(request.getActive());

    return rd.update(role);
  }

  @Nonnull
  public Role changeRolePrivilegeMapping(@Nonnull ChangeRolePrivilegeMappingRequest request) {
    if(request.getId() == null)
      throw new IllegalArgumentException("id is null");

    Role role = rd.get(request.getId());
    if(role == null)
      throw new RuntimeException("role not found: " + request.getId());

    if(request.getToAdd() != null) {
      for(int privilegeId : request.getToAdd()) {
        Privilege privilege = pd.get(privilegeId);
        if(privilege == null)
          throw new RuntimeException("privilege not found: " + privilegeId);

        assert role.getPrivileges() != null;
        if(!role.getPrivileges().add(privilege))
          log.warn("role " + role.getName() + " already has privilege " + privilege.getName());
      }
    }

    if(request.getToRemove() != null) {
      for(int privilegeId : request.getToAdd()) {
        Privilege privilege = pd.get(privilegeId);
        if(privilege == null)
          throw new RuntimeException("privilege not found: " + privilegeId);

        assert role.getPrivileges() != null;
        if(!role.getPrivileges().remove(privilege))
          log.warn("role " + role.getName() + " does not have privilege " + privilege.getName());
      }
    }

    return rd.update(role);
  }

  @Nonnull
  public QueryResult<Privilege> queryPrivileges(@Nonnull QueryRequest request) {
    return pd.query(request);
  }

  @Nonnull
  public Privilege createPrivilege(@Nonnull UpdatePrivilegeRequest request) {
    return pd.create(new Privilege(request.getName(), request.getDescription()));
  }

  @Nonnull
  public Privilege updatePrivilege(@Nonnull UpdatePrivilegeRequest request) {
    if(request.getId() == null)
      throw new IllegalArgumentException("id is null");

    Privilege privilege = pd.get(request.getId());
    if(privilege == null)
      throw new RuntimeException("privilege is null");

    privilege.setName(request.getName());
    privilege.setDescription(request.getDescription());
    privilege.setActive(request.getActive());

    return pd.update(privilege);
  }
}
