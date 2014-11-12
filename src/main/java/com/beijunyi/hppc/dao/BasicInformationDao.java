package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.BasicInformation;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class BasicInformationDao extends AbstractDao<BasicInformation> implements Dao<BasicInformation> {

  @Inject
  public BasicInformationDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<BasicInformation> getPersistentClass() {
    return BasicInformation.class;
  }
}
