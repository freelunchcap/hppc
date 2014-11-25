package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.system.AccessPoint;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class AccessPointDao extends AbstractDao<AccessPoint> {

  @Inject
  public AccessPointDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<AccessPoint> getPersistentClass() {
    return AccessPoint.class;
  }
}
