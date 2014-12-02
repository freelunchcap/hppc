package com.beijunyi.hppc.services.data;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.data.forms.FecesTestRecord;

@Named
@Singleton
public class FecesTestRecordService extends DataService<FecesTestRecord> {

  @Inject
  public FecesTestRecordService(@Nonnull Dao<FecesTestRecord> dao) {
    super(dao);
  }

}
