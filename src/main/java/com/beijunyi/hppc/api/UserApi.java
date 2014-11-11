package com.beijunyi.hppc.api;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.beijunyi.hppc.services.SecurityService;
import org.springframework.security.access.annotation.Secured;

@Named
@Singleton
@Path("/api/user")
public class UserApi {

  @Inject
  public SecurityService ss;

  @GET
  @Path("login-information")
  @Secured("ROLE_STAFF")
  public Response getLoginInformation() {
    return Response.ok(ss.getLoginInformation()).build();
  }

}
