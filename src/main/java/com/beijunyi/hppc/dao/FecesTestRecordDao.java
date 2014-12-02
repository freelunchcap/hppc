package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.forms.FecesTestRecord;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class FecesTestRecordDao extends AbstractDao<FecesTestRecord> implements Dao<FecesTestRecord> {

  @Inject
  public FecesTestRecordDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<FecesTestRecord> getPersistentClass() {
    return FecesTestRecord.class;
  }
}
