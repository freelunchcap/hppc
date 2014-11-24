package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.forms.BasicInformation;
import com.beijunyi.hppc.models.data.forms.MedicalRecord;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class MedicalRecordDao extends AbstractDao<MedicalRecord> implements Dao<MedicalRecord> {

  @Inject
  public MedicalRecordDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<MedicalRecord> getPersistentClass() {
    return MedicalRecord.class;
  }
}
