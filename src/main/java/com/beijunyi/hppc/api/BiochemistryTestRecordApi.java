package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import com.beijunyi.hppc.models.data.forms.BiochemistryTestRecord;
import com.beijunyi.hppc.services.data.DataService;

@Named
@Singleton
@Path("/api/medical/biochemistry-test-record")
public class BiochemistryTestRecordApi extends DataApi<BiochemistryTestRecord> {

  @Inject
  public BiochemistryTestRecordApi(@Nonnull DataService<BiochemistryTestRecord> service) {
    super(service);
  }

}
