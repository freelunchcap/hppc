package com.beijunyi.hppc.services.data;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.data.forms.AntigenAntibodyTestRecord;

@Named
@Singleton
public class AntigenAntibodyTestRecordService extends DataService<AntigenAntibodyTestRecord> {

  @Inject
  public AntigenAntibodyTestRecordService(@Nonnull Dao<AntigenAntibodyTestRecord> dao) {
    super(dao);
  }

}
