package com.beijunyi.hppc.models.data.admin;

import java.util.Set;
import javax.annotation.Nullable;
import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "privilege")
public final class Privilege {

  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "name", unique = true, nullable = false)
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "active", nullable = false)
  private Boolean active = true;

  @ManyToMany(mappedBy = "privileges")
  @JsonIgnore
  private Set<Role> roles;

  public Privilege() {
  }

  public Privilege(@Nullable String name, @Nullable String description) {
    this.name = name;
    this.description = description;
  }

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
  public String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  @Nullable
  public Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  @Nullable
  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(@Nullable Set<Role> roles) {
    this.roles = roles;
  }
}
