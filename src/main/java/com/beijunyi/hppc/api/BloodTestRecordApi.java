package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import com.beijunyi.hppc.models.data.forms.BloodTestRecord;
import com.beijunyi.hppc.services.data.DataService;

@Named
@Singleton
@Path("/api/medical/blood-test-record")
public class BloodTestRecordApi extends DataApi<BloodTestRecord> {

  @Inject
  public BloodTestRecordApi(@Nonnull DataService<BloodTestRecord> service) {
    super(service);
  }

}
