package com.beijunyi.hppc.services.data;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.data.forms.UrineTestRecord;

@Named
@Singleton
public class UrineTestRecordService extends DataService<UrineTestRecord> {

  @Inject
  public UrineTestRecordService(@Nonnull Dao<UrineTestRecord> dao) {
    super(dao);
  }

}
