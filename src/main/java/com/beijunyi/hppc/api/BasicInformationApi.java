package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.*;

import com.beijunyi.hppc.models.data.forms.BasicInformation;
import com.beijunyi.hppc.services.BasicInformationService;
import com.beijunyi.hppc.services.DataService;

@Named
@Singleton
@Path("/api/medical/basic-information")
public class BasicInformationApi extends DataApi<BasicInformation> {

  @Inject
  public BasicInformationApi(@Nonnull DataService<BasicInformation> service) {
    super(service);
  }

}
