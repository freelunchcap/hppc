package com.beijunyi.hppc.models.data.system;

import java.util.Set;
import javax.annotation.Nullable;
import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "account")
@DynamicUpdate
public final class Account {

  @Id
  @GeneratedValue
  private Integer id;

  @Column(name = "username", unique = true, nullable = false)
  private String username;

  @Column(name = "alias", unique = false, nullable = false)
  private String alias;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "admin", nullable = false)
  private Boolean admin;

  @Column(name = "active", nullable = false)
  private Boolean active;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "account__role",
              joinColumns = {@JoinColumn(name = "account_id", referencedColumnName = "id")},
              inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
  @JsonIgnore
  private Set<Role> roles;

  public Account(@Nullable String username, @Nullable String alias, @Nullable String password, @Nullable Boolean admin) {
    this.username = username;
    this.alias = alias;
    this.password = password;
    this.admin = admin;
    this.active = true;
  }

  public Account() {
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

  @Nullable
  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(@Nullable Set<Role> roles) {
    this.roles = roles;
  }
}
