package com.beijunyi.hppc.models.api;

import java.util.Set;

public class ChangeRolePrivilegeMappingRequest {

  private Integer role;
  private Set<Integer> toAdd;
  private Set<Integer> toRemove;

  public Integer getRole() {
    return role;
  }

  public void setRole(Integer role) {
    this.role = role;
  }

  public Set<Integer> getToAdd() {
    return toAdd;
  }

  public void setToAdd(Set<Integer> toAdd) {
    this.toAdd = toAdd;
  }

  public Set<Integer> getToRemove() {
    return toRemove;
  }

  public void setToRemove(Set<Integer> toRemove) {
    this.toRemove = toRemove;
  }
}
