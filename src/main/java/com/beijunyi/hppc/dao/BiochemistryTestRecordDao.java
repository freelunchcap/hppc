package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.forms.BiochemistryTestRecord;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class BiochemistryTestRecordDao extends AbstractDao<BiochemistryTestRecord> implements Dao<BiochemistryTestRecord> {

  @Inject
  public BiochemistryTestRecordDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<BiochemistryTestRecord> getPersistentClass() {
    return BiochemistryTestRecord.class;
  }
}
