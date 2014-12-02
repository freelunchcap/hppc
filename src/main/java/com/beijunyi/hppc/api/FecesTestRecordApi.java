package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import com.beijunyi.hppc.models.data.forms.FecesTestRecord;
import com.beijunyi.hppc.services.data.DataService;

@Named
@Singleton
@Path("/api/medical/feces-test-record")
public class FecesTestRecordApi extends DataApi<FecesTestRecord> {

  @Inject
  public FecesTestRecordApi(@Nonnull DataService<FecesTestRecord> service) {
    super(service);
  }

}
