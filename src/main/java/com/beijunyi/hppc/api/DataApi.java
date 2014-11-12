package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.beijunyi.hppc.services.DataService;
import org.springframework.security.access.annotation.Secured;

public abstract class DataApi<T> {

  protected DataService<T> service;

  protected DataApi(@Nonnull DataService<T> service) {
    this.service = service;
  }

  @GET
  @Secured("ROLE_STAFF")
  public Response query(@Context UriInfo info) {
    return Response.ok(service.query(ApiUtils.getRequest(info))).build();
  }

  @POST
  @Secured("ROLE_STAFF")
  public Response save(@Nullable T obj) {
    if(obj == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(service.save(obj)).build();
  }

  @GET
  @Path("{id}")
  @Secured("ROLE_STAFF")
  public Response get(@PathParam("id") int id) {
    return Response.ok(service.get(id)).build();
  }

  @DELETE
  @Path("{id}")
  @Secured("ROLE_STAFF")
  public Response delete(@PathParam("id") int id) {
    return Response.ok(service.delete(id)).build();
  }

}
