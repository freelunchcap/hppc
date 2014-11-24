package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import com.beijunyi.hppc.models.data.forms.MedicalRecord;
import com.beijunyi.hppc.services.data.DataService;

@Named
@Singleton
@Path("/api/medical/medical-record")
public class MedicalRecordApi extends DataApi<MedicalRecord> {

  @Inject
  public MedicalRecordApi(@Nonnull DataService<MedicalRecord> service) {
    super(service);
  }

}
