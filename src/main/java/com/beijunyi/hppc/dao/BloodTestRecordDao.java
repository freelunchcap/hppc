package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.forms.BloodTestRecord;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class BloodTestRecordDao extends AbstractDao<BloodTestRecord> implements Dao<BloodTestRecord> {

  @Inject
  public BloodTestRecordDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<BloodTestRecord> getPersistentClass() {
    return BloodTestRecord.class;
  }
}
