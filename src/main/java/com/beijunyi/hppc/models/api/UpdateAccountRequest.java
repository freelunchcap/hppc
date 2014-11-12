package com.beijunyi.hppc.models.api;

import javax.annotation.Nullable;

public class UpdateAccountRequest {

  private Integer id;
  private String username;
  private String alias;
  private String password;
  private Boolean admin;
  private Boolean active;

  public UpdateAccountRequest(@Nullable String username, @Nullable String alias, @Nullable String password, @Nullable Boolean admin) {
    this.username = username;
    this.alias = alias;
    this.password = password;
    this.admin = admin;
  }

  public UpdateAccountRequest() {
  }

  @Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@Nullable Integer id) {
    this.id = id;
  }

  @Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  @Nullable
  public String getAlias() {
    return alias;
  }

  public void setAlias(@Nullable String alias) {
    this.alias = alias;
  }

  @Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(@Nullable String password) {
    this.password = password;
  }

  @Nullable
  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(@Nullable Boolean admin) {
    this.admin = admin;
  }

  @Nullable
  public Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }
}
