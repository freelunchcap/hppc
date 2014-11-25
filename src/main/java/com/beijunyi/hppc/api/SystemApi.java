package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.beijunyi.hppc.models.api.*;
import com.beijunyi.hppc.services.SystemService;

@Named
@Singleton
@Path("/api/system")
public class SystemApi {

  @Inject
  private SystemService ss;

  @GET
  @Path("accounts")
  public Response queryAccounts(@Nonnull @Context UriInfo uriInfo) {
    return Response.ok(ss.queryAccounts(ApiUtils.getRequest(uriInfo))).build();
  }

  @POST
  @Path("account/create")
  public Response createAccount(@Nullable UpdateAccountRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(ss.createAccount(request)).build();
  }

  @POST
  @Path("account/update")
  public Response updateAccount(@Nullable UpdateAccountRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(ss.updateAccount(request)).build();
  }

  @POST
  @Path("account/change-password")
  public Response changeAccountPassword(@Nullable ChangeAccountPasswordRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(ss.changeAccountPassword(request)).build();
  }

  @POST
  @Path("account/change-role-mapping")
  public Response changeAccountRoleMapping(@Nullable ChangeAccountRoleMappingRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(ss.changeAccountRoleMapping(request)).build();
  }

  @GET
  @Path("roles")
  public Response queryRoles(@Nonnull @Context UriInfo uriInfo) {
    return Response.ok(ss.queryRoles(ApiUtils.getRequest(uriInfo))).build();
  }

  @POST
  @Path("role/create")
  public Response createRole(@Nullable UpdateRoleRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(ss.createRole(request)).build();
  }

  @POST
  @Path("role/update")
  public Response updateRole(@Nullable UpdateRoleRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(ss.updateRole(request)).build();
  }

  @POST
  @Path("role/change-privilege-mapping")
  public Response changeRolePrivilegeMapping(@Nullable ChangeRolePrivilegeMappingRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(ss.changeRolePrivilegeMapping(request)).build();
  }

  @GET
  @Path("privileges")
  public Response queryPrivileges(@Nonnull @Context UriInfo uriInfo) {
    return Response.ok(ss.queryPrivileges(ApiUtils.getRequest(uriInfo))).build();
  }

  @POST
  @Path("privilege/create")
  public Response createPrivilege(@Nullable UpdatePrivilegeRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(ss.createPrivilege(request)).build();
  }

  @POST
  @Path("privilege/update")
  public Response updatePrivilege(@Nullable UpdatePrivilegeRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(ss.updatePrivilege(request)).build();
  }

}
