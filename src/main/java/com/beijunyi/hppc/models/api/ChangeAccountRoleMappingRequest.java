package com.beijunyi.hppc.models.api;

import java.util.Set;

public class ChangeAccountRoleMappingRequest {

  private Integer account;
  private Set<Integer> toAdd;
  private Set<Integer> toRemove;

  public Integer getAccount() {
    return account;
  }

  public void setAccount(Integer account) {
    this.account = account;
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
