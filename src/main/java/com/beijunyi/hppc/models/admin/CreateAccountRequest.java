package com.beijunyi.hppc.models.admin;

import javax.annotation.Nullable;

public class CreateAccountRequest {
  private String username;
  private String password;
  private Boolean admin;

  public CreateAccountRequest() {
  }

  public CreateAccountRequest(@Nullable String username, @Nullable String password, @Nullable Boolean admin) {
    this.username = username;
    this.password = password;
    this.admin = admin;
  }

  @Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(@Nullable String username) {
    this.username = username;
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
}
