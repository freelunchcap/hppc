package com.beijunyi.hppc.dao;

import java.util.List;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.admin.Privilege;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

@Named
@Singleton
public class PrivilegeDaoImpl extends AbstractDao<Privilege> implements PrivilegeDao {

  @Inject
  public PrivilegeDaoImpl(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<Privilege> getPersistentClass() {
    return Privilege.class;
  }

  @Nonnull
  @Override
  @SuppressWarnings("unchecked")
  public List<Privilege> listPrivilegesByRoleId(int roleId) {
    return sf.getCurrentSession()
             .createCriteria(getPersistentClass())
             .createAlias("roles", "role")
             .add(Restrictions.eq("role.id", roleId))
             .list();
  }
}
