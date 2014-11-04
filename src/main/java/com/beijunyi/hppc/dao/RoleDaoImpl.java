package com.beijunyi.hppc.dao;

import java.util.List;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.admin.Role;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

@Named
@Singleton
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {

  @Inject
  public RoleDaoImpl(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<Role> getPersistentClass() {
    return Role.class;
  }

  @Nonnull
  @Override
  @SuppressWarnings("unchecked")
  public List<Role> listRolesByAccountId(int accountId) {
    return sf.getCurrentSession()
             .createCriteria(getPersistentClass())
             .createAlias("accounts", "account")
             .add(Restrictions.eq("account.id", accountId))
             .list();
  }
}
