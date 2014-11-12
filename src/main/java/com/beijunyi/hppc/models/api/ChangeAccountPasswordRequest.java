package com.beijunyi.hppc.models.api;

import javax.annotation.Nullable;

public class ChangeAccountPasswordRequest {

  private Integer id;
  private String oldPassword;
  private String newPassword;

  @Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@Nullable Integer id) {
    this.id = id;
  }

  @Nullable
  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(@Nullable String oldPassword) {
    this.oldPassword = oldPassword;
  }

  @Nullable
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(@Nullable String newPassword) {
    this.newPassword = newPassword;
  }
}
