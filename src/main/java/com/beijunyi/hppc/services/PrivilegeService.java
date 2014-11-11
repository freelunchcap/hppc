package com.beijunyi.hppc.services;

import java.util.HashSet;
import java.util.List;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import com.beijunyi.hppc.dao.AccountDao;
import com.beijunyi.hppc.dao.PrivilegeDao;
import com.beijunyi.hppc.dao.RoleDao;
import com.beijunyi.hppc.models.data.admin.Account;
import com.beijunyi.hppc.models.data.admin.Privilege;
import com.beijunyi.hppc.models.data.admin.Role;
import com.beijunyi.hppc.models.internal.QueryRequest;
import com.beijunyi.hppc.models.internal.QueryResult;

@Named
@Singleton
public class PrivilegeService {

  private final PrivilegeDao pd;
  private final RoleDao rd;
  private final AccountDao ad;

  @Inject
  public PrivilegeService(@Nonnull PrivilegeDao pd, @Nonnull RoleDao rd, @Nonnull AccountDao ad) {
    this.pd = pd;
    this.rd = rd;
    this.ad = ad;
  }

  @Nonnull
  @Transactional
  public QueryResult<Role> queryRoles(@Nonnull QueryRequest request) {
    return rd.query(request);
  }

  @Nonnull
  @Transactional
  public QueryResult<Privilege> queryPrivileges(@Nonnull QueryRequest request) {
    return pd.query(request);
  }

  @Nonnull
  @Transactional
  public List<Privilege> listPrivilegesByRoleId(int roleId) {
    return pd.listPrivilegesByRoleId(roleId);
  }

  @Nonnull
  @Transactional
  public List<Role> listRolesByAccountId(int accountId) {
    return rd.listRolesByAccountId(accountId);
  }

  @Nonnull
  @Transactional
  public Privilege createPrivilege(@Nonnull Privilege request) {
    Privilege privilege = new Privilege(request.getName(), request.getDescription());
    pd.save(privilege);
    return privilege;
  }

  @Nonnull
  @Transactional
  public Role createRole(@Nonnull Role request) {
    Role role = new Role(request.getName(), request.getDescription());
    rd.save(role);
    return role;
  }

  @Nonnull
  @Transactional
  public Privilege updatePrivilege(@Nonnull Privilege privilege) {
    if(privilege.getId() == null)
      throw new IllegalArgumentException("Missing privilege id");

    Privilege currentPrivilege = pd.get(privilege.getId());
    if(currentPrivilege == null)
      throw new IllegalArgumentException("Cannot find privilege with id = \"" + privilege.getId() + "\"");

    currentPrivilege.setName(privilege.getName());
    currentPrivilege.setDescription(privilege.getDescription());
    currentPrivilege.setActive(privilege.getActive());

    return currentPrivilege;
  }

  @Nonnull
  @Transactional
  public Role updatePrivilege(@Nonnull Role role) {
    if(role.getId() == null)
      throw new IllegalArgumentException("Missing role id");

    Role currentRole = rd.get(role.getId());
    if(currentRole == null)
      throw new IllegalArgumentException("Cannot find role with id = \"" + role.getId() + "\"");

    currentRole.setName(role.getName());
    currentRole.setDescription(role.getDescription());
    currentRole.setActive(role.getActive());

    return currentRole;
  }


  @Transactional
  public void addPrivilegeToRole(int privilegeId, int roleId) {
    Privilege privilege = pd.get(privilegeId);
    if(privilege == null)
      throw new IllegalArgumentException("Cannot find privilege with id = \"" + privilegeId + "\"");

    Role role = rd.get(roleId);
    if(role == null)
      throw new IllegalArgumentException("Cannot find role with id = \"" + roleId + "\"");

    if(role.getPrivileges() == null)
      role.setPrivileges(new HashSet<Privilege>());
    role.getPrivileges().add(privilege);
  }

  @Transactional
  public void addRoleToAccount(int roleId, int accountId) {
    Role role = rd.get(roleId);
    if(role == null)
      throw new IllegalArgumentException("Cannot find role with id = \"" + roleId + "\"");

    Account account = ad.get(accountId);
    if(account == null)
      throw new IllegalArgumentException("Cannot find account with id = \"" + accountId + "\"");

    if(account.getRoles() == null)
      account.setRoles(new HashSet<Role>());
    account.getRoles().add(role);
  }

  @Transactional
  public void removePrivilegeFromRole(int privilegeId, int roleId) {
    Privilege privilege = pd.get(privilegeId);
    if(privilege == null)
      throw new IllegalArgumentException("Cannot find privilege with id = \"" + privilegeId + "\"");

    Role role = rd.get(roleId);
    if(role == null)
      throw new IllegalArgumentException("Cannot find role with id = \"" + roleId + "\"");

    if(role.getPrivileges() == null || !role.getPrivileges().remove(privilege))
      throw new IllegalArgumentException("Cannot remove privilege \"" + privilege.getName() + "\" from role \"" + role.getName() + "\"");
  }

  @Transactional
  public void removeRoleFromAccount(int roleId, int accountId) {
    Role role = rd.get(roleId);
    if(role == null)
      throw new IllegalArgumentException("Cannot find role with id = \"" + roleId + "\"");

    Account account = ad.get(accountId);
    if(account == null)
      throw new IllegalArgumentException("Cannot find account with id = \"" + accountId + "\"");

    if(account.getRoles() == null || !account.getRoles().remove(role))
      throw new IllegalArgumentException("Cannot remove role \"" + role.getName() + "\" from account \"" + account.getUsername() + "\"");
  }



}
