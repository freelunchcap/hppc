package com.beijunyi.hppc.services;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.data.forms.BasicInformation;
import com.beijunyi.hppc.models.data.forms.MedicalRecord;

@Named
@Singleton
public class MedicalRecordService extends DataService<MedicalRecord> {

  @Inject
  public MedicalRecordService(@Nonnull Dao<MedicalRecord> dao) {
    super(dao);
  }

}
