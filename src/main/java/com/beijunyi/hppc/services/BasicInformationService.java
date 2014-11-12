package com.beijunyi.hppc.services;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.data.forms.BasicInformation;

@Named
@Singleton
public class BasicInformationService extends DataService<BasicInformation> {

  @Inject
  public BasicInformationService(@Nonnull Dao<BasicInformation> dao) {
    super(dao);
  }

}
