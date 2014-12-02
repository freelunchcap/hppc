package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import com.beijunyi.hppc.models.data.forms.SkinTestRecord;
import com.beijunyi.hppc.services.data.DataService;

@Named
@Singleton
@Path("/api/medical/skin-test-record")
public class SkinTestRecordApi extends DataApi<SkinTestRecord> {

  @Inject
  public SkinTestRecordApi(@Nonnull DataService<SkinTestRecord> service) {
    super(service);
  }

}
