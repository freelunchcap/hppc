package com.beijunyi.hppc.dao;

import java.util.List;
import javax.annotation.Nonnull;

import com.beijunyi.hppc.models.data.admin.Privilege;

public interface PrivilegeDao extends Dao<Privilege> {

  @Nonnull
  List<Privilege> listPrivilegesByRoleId(int roleId);

}
