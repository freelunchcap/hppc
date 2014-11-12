package com.beijunyi.hppc.models.api;

import java.util.Set;

public class LoginInformation {
  private String alias;
  private Boolean admin;
  private Set<Integer> privileges;

  public LoginInformation(String alias, Boolean admin, Set<Integer> privileges) {
    this.alias = alias;
    this.admin = admin;
    this.privileges = privileges;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public Set<Integer> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(Set<Integer> privileges) {
    this.privileges = privileges;
  }
}
