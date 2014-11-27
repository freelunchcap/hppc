package com.beijunyi.hppc.services.data;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.data.forms.DiagnosisRecord;

@Named
@Singleton
public class DiagnosisRecordService extends DataService<DiagnosisRecord> {

  @Inject
  public DiagnosisRecordService(@Nonnull Dao<DiagnosisRecord> dao) {
    super(dao);
  }

}
