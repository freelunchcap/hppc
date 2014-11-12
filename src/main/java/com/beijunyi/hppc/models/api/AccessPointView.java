package com.beijunyi.hppc.models.api;

import java.util.Set;
import javax.annotation.Nullable;

public class AccessPointView {

  private Integer id;
  private String name;
  private Set<Integer> readPrivileges;
  private Set<Integer> writePrivileges;

  @Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@Nullable Integer id) {
    this.id = id;
  }

  @Nullable
  public String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  @Nullable
  public Set<Integer> getReadPrivileges() {
    return readPrivileges;
  }

  public void setReadPrivileges(@Nullable Set<Integer> readPrivileges) {
    this.readPrivileges = readPrivileges;
  }

  @Nullable
  public Set<Integer> getWritePrivileges() {
    return writePrivileges;
  }

  public void setWritePrivileges(@Nullable Set<Integer> writePrivileges) {
    this.writePrivileges = writePrivileges;
  }
}
