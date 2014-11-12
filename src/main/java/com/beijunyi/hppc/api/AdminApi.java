package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.beijunyi.hppc.models.api.*;

@Named
@Singleton
@Path("/api/admin")
public class AdminApi {

  @GET
  @Path("accounts")
  public Response queryAccounts(@Nonnull @Context UriInfo uriInfo) {
    return Response.ok().build();
  }

  @POST
  @Path("account/create")
  public Response createAccount(@Nullable UpdateAccountRequest request) {
    return Response.status(Response.Status.BAD_REQUEST).build();
  }

  @POST
  @Path("account/update")
  public Response updateAccount(@Nullable UpdateAccountRequest request) {
    return Response.status(Response.Status.BAD_REQUEST).build();
  }

  @POST
  @Path("account/change-password")
  public Response changeAccountPassword(@Nullable ChangeAccountPasswordRequest request) {
    return Response.status(Response.Status.BAD_REQUEST).build();
  }

  @POST
  @Path("account/change-role-mapping")
  public Response changeAccountRoleMapping(@Nullable ChangeAccountRoleMappingRequest request) {
    return Response.status(Response.Status.BAD_REQUEST).build();
  }

  @GET
  @Path("roles")
  public Response queryRoles(@Nonnull @Context UriInfo uriInfo) {
    return Response.ok().build();
  }

  @POST
  @Path("role/create")
  public Response createRole(@Nullable UpdateRoleRequest request) {
    return Response.status(Response.Status.BAD_REQUEST).build();
  }

  @POST
  @Path("role/update")
  public Response updateRole(@Nullable UpdateRoleRequest request) {
    return Response.status(Response.Status.BAD_REQUEST).build();
  }

  @POST
  @Path("role/change-privilege-mapping")
  public Response changeRolePrivilegeMapping(@Nullable ChangeRolePrivilegeMappingRequest request) {
    return Response.status(Response.Status.BAD_REQUEST).build();
  }

  @GET
  @Path("privileges")
  public Response queryPrivileges(@Nonnull @Context UriInfo uriInfo) {
    return Response.ok().build();
  }

  @POST
  @Path("privilege/create")
  public Response createPrivilege(@Nullable UpdatePrivilegeRequest request) {
    return Response.status(Response.Status.BAD_REQUEST).build();
  }

  @POST
  @Path("privilege/update")
  public Response updatePrivilege(@Nullable UpdatePrivilegeRequest request) {
    return Response.status(Response.Status.BAD_REQUEST).build();
  }

}
