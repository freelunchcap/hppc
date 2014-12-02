package com.beijunyi.hppc.services.data;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.data.forms.BloodTestRecord;

@Named
@Singleton
public class BloodTestRecordService extends DataService<BloodTestRecord> {

  @Inject
  public BloodTestRecordService(@Nonnull Dao<BloodTestRecord> dao) {
    super(dao);
  }

}
