package com.beijunyi.hppc.models.api;

import java.util.Set;
import javax.annotation.Nullable;

public class ChangeAccountRoleMappingRequest {

  private Integer id;
  private Set<Integer> toAdd;
  private Set<Integer> toRemove;

  @Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@Nullable Integer id) {
    this.id = id;
  }

  @Nullable
  public Set<Integer> getToAdd() {
    return toAdd;
  }

  public void setToAdd(@Nullable Set<Integer> toAdd) {
    this.toAdd = toAdd;
  }

  @Nullable
  public Set<Integer> getToRemove() {
    return toRemove;
  }

  public void setToRemove(@Nullable Set<Integer> toRemove) {
    this.toRemove = toRemove;
  }
}
