package com.beijunyi.hppc.services.data;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.data.forms.BiochemistryTestRecord;

@Named
@Singleton
public class BiochemistryTestRecordService extends DataService<BiochemistryTestRecord> {

  @Inject
  public BiochemistryTestRecordService(@Nonnull Dao<BiochemistryTestRecord> dao) {
    super(dao);
  }

}
