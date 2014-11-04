package com.beijunyi.hppc.dao;

import java.util.List;
import javax.annotation.Nonnull;

import com.beijunyi.hppc.models.admin.Role;

public interface RoleDao extends Dao<Role> {

  @Nonnull
  List<Role> listRolesByAccountId(int accountId);

}
