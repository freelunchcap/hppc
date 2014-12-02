package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import com.beijunyi.hppc.models.data.forms.AntigenAntibodyTestRecord;
import com.beijunyi.hppc.services.data.DataService;

@Named
@Singleton
@Path("/api/medical/antigen-antibody-test-record")
public class AntigenAntibodyTestRecordApi extends DataApi<AntigenAntibodyTestRecord> {

  @Inject
  public AntigenAntibodyTestRecordApi(@Nonnull DataService<AntigenAntibodyTestRecord> service) {
    super(service);
  }

}
