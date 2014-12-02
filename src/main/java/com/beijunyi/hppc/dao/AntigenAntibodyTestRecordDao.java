package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.forms.AntigenAntibodyTestRecord;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class AntigenAntibodyTestRecordDao extends AbstractDao<AntigenAntibodyTestRecord> implements Dao<AntigenAntibodyTestRecord> {

  @Inject
  public AntigenAntibodyTestRecordDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<AntigenAntibodyTestRecord> getPersistentClass() {
    return AntigenAntibodyTestRecord.class;
  }
}
