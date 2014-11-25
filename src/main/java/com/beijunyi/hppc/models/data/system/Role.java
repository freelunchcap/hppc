package com.beijunyi.hppc.models.data.system;

import java.util.Set;
import javax.annotation.Nullable;
import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "role")
@DynamicUpdate
public final class Role {

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

  @ManyToMany
  @JoinTable(name = "role__privilege",
              joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
              inverseJoinColumns = {@JoinColumn(name = "privilege_id", referencedColumnName = "id")})
  @JsonIgnore
  private Set<Privilege> privileges;

  @ManyToMany(mappedBy = "roles")
  @JsonIgnore
  private Set<Account> accounts;

  public Role() {
  }

  public Role(@Nullable String name, @Nullable String description) {
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
  public Set<Privilege> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(@Nullable Set<Privilege> privileges) {
    this.privileges = privileges;
  }

  @Nullable
  public Set<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(@Nullable Set<Account> accounts) {
    this.accounts = accounts;
  }
}
