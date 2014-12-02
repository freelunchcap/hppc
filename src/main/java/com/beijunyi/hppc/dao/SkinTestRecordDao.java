package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.forms.SkinTestRecord;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class SkinTestRecordDao extends AbstractDao<SkinTestRecord> implements Dao<SkinTestRecord> {

  @Inject
  public SkinTestRecordDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<SkinTestRecord> getPersistentClass() {
    return SkinTestRecord.class;
  }
}
