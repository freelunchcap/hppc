package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.beijunyi.hppc.models.internal.QueryResult;
import com.beijunyi.hppc.services.data.DataService;
import org.springframework.security.access.annotation.Secured;

public abstract class DataApi<T> {

  protected DataService<T> service;

  protected DataApi(@Nonnull DataService<T> service) {
    this.service = service;
  }

  @GET
  @Secured("ROLE_STAFF")
  public Response query(@Context UriInfo info) {
    QueryResult<T> result = service.query(ApiUtils.getRequest(info));
    Response.ResponseBuilder builder = Response.ok(result.getData());
    if(result.getTotal() != -1)
      builder.header("total", result.getTotal());
    return builder.build();
  }

  @POST
  @Secured("ROLE_ADMIN")
  public Response save(@Nullable T obj) {
    if(obj == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(service.save(obj)).build();
  }

  @GET
  @Path("{id}")
  @Secured("ROLE_ADMIN")
  public Response get(@PathParam("id") int id) {
    return Response.ok(service.get(id)).build();
  }

  @DELETE
  @Path("{id}")
  @Secured("ROLE_ADMIN")
  public Response delete(@PathParam("id") int id) {
    return Response.ok(service.delete(id)).build();
  }

}
