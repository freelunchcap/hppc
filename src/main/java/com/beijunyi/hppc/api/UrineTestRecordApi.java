package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import com.beijunyi.hppc.models.data.forms.UrineTestRecord;
import com.beijunyi.hppc.services.data.DataService;

@Named
@Singleton
@Path("/api/medical/urine-test-record")
public class UrineTestRecordApi extends DataApi<UrineTestRecord> {

  @Inject
  public UrineTestRecordApi(@Nonnull DataService<UrineTestRecord> service) {
    super(service);
  }

}
