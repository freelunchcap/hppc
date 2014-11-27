package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.forms.DiagnosisRecord;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class DiagnosisRecordDao extends AbstractDao<DiagnosisRecord> implements Dao<DiagnosisRecord> {

  @Inject
  public DiagnosisRecordDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<DiagnosisRecord> getPersistentClass() {
    return DiagnosisRecord.class;
  }
}
