package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import com.beijunyi.hppc.models.data.forms.BasicInformation;
import com.beijunyi.hppc.services.data.DataService;
import org.springframework.security.access.annotation.Secured;

@Named
@Singleton
@Path("/api/medical/basic-information")
public class BasicInformationApi extends DataApi<BasicInformation> {

  @Inject
  public BasicInformationApi(@Nonnull DataService<BasicInformation> service) {
    super(service);
  }

  @Override
  @POST
  @Secured("ROLE_STAFF")
  public Response save(@Nullable BasicInformation obj) {
    return super.save(obj);
  }
}
