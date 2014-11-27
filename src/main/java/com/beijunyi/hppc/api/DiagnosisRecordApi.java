package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import com.beijunyi.hppc.models.data.forms.DiagnosisRecord;
import com.beijunyi.hppc.services.data.DataService;

@Named
@Singleton
@Path("/api/medical/diagnosis-record")
public class DiagnosisRecordApi extends DataApi<DiagnosisRecord> {

  @Inject
  public DiagnosisRecordApi(@Nonnull DataService<DiagnosisRecord> service) {
    super(service);
  }

}
