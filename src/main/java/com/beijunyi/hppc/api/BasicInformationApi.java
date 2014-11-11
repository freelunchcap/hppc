package com.beijunyi.hppc.api;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Named
@Singleton
@Path("/api/basic-information")
public class BasicInformationApi {

  @GET
  public Response get(@Context UriInfo info) {
    return Response.ok().build();
  }

  @POST
  public Response post() {
    return Response.ok().build();
  }

  @GET
  @Path("{id}")
  public Response get(@PathParam("id") int id) {
    return Response.ok().build();
  }

  @PUT
  public Response put() {
    return Response.ok().build();
  }

  @DELETE
  @Path("{id}")
  public Response delete(@PathParam("id") int id) {
    return Response.ok().build();
  }

}
