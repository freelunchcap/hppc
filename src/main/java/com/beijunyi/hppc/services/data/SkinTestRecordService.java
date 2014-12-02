package com.beijunyi.hppc.services.data;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.data.forms.SkinTestRecord;

@Named
@Singleton
public class SkinTestRecordService extends DataService<SkinTestRecord> {

  @Inject
  public SkinTestRecordService(@Nonnull Dao<SkinTestRecord> dao) {
    super(dao);
  }

}
