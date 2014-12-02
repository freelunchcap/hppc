package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.forms.UrineTestRecord;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class UrineTestRecordDao extends AbstractDao<UrineTestRecord> implements Dao<UrineTestRecord> {

  @Inject
  public UrineTestRecordDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<UrineTestRecord> getPersistentClass() {
    return UrineTestRecord.class;
  }
}
