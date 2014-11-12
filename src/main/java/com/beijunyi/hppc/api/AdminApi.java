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
import com.beijunyi.hppc.services.AdminService;

@Named
@Singleton
@Path("/api/admin")
public class AdminApi {

  @Inject
  private AdminService as;

  @GET
  @Path("accounts")
  public Response queryAccounts(@Nonnull @Context UriInfo uriInfo) {
    return Response.ok(as.queryAccounts(ApiUtils.getRequest(uriInfo))).build();
  }

  @POST
  @Path("account/create")
  public Response createAccount(@Nullable UpdateAccountRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(as.createAccount(request)).build();
  }

  @POST
  @Path("account/update")
  public Response updateAccount(@Nullable UpdateAccountRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(as.updateAccount(request)).build();
  }

  @POST
  @Path("account/change-password")
  public Response changeAccountPassword(@Nullable ChangeAccountPasswordRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(as.changeAccountPassword(request)).build();
  }

  @POST
  @Path("account/change-role-mapping")
  public Response changeAccountRoleMapping(@Nullable ChangeAccountRoleMappingRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(as.changeAccountRoleMapping(request)).build();
  }

  @GET
  @Path("roles")
  public Response queryRoles(@Nonnull @Context UriInfo uriInfo) {
    return Response.ok(as.queryRoles(ApiUtils.getRequest(uriInfo))).build();
  }

  @POST
  @Path("role/create")
  public Response createRole(@Nullable UpdateRoleRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(as.createRole(request)).build();
  }

  @POST
  @Path("role/update")
  public Response updateRole(@Nullable UpdateRoleRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(as.updateRole(request)).build();
  }

  @POST
  @Path("role/change-privilege-mapping")
  public Response changeRolePrivilegeMapping(@Nullable ChangeRolePrivilegeMappingRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(as.changeRolePrivilegeMapping(request)).build();
  }

  @GET
  @Path("privileges")
  public Response queryPrivileges(@Nonnull @Context UriInfo uriInfo) {
    return Response.ok(as.queryPrivileges(ApiUtils.getRequest(uriInfo))).build();
  }

  @POST
  @Path("privilege/create")
  public Response createPrivilege(@Nullable UpdatePrivilegeRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(as.createPrivilege(request)).build();
  }

  @POST
  @Path("privilege/update")
  public Response updatePrivilege(@Nullable UpdatePrivilegeRequest request) {
    if(request == null)
      return Response.status(Response.Status.BAD_REQUEST).build();
    return Response.ok(as.updatePrivilege(request)).build();
  }

}
