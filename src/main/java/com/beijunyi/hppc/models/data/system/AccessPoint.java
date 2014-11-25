package com.beijunyi.hppc.models.data.system;

import java.util.Set;
import javax.annotation.Nullable;
import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "access_point")
@DynamicUpdate
public class AccessPoint {

  @Id
  @GeneratedValue
  private Integer id;

  @Column(name = "name", unique = true, nullable = false)
  private String name;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "access_point_read__privilege",
              joinColumns = {@JoinColumn(name = "access_point_id", referencedColumnName = "id")},
              inverseJoinColumns = {@JoinColumn(name = "privilege_id", referencedColumnName = "id")})
  private Set<Privilege> readPrivileges;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "access_point_write__privilege",
              joinColumns = {@JoinColumn(name = "access_point_id", referencedColumnName = "id")},
              inverseJoinColumns = {@JoinColumn(name = "privilege_id", referencedColumnName = "id")})
  private Set<Privilege> writePrivileges;

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
  public Set<Privilege> getReadPrivileges() {
    return readPrivileges;
  }

  public void setReadPrivileges(@Nullable Set<Privilege> readPrivileges) {
    this.readPrivileges = readPrivileges;
  }

  @Nullable
  public Set<Privilege> getWritePrivileges() {
    return writePrivileges;
  }

  public void setWritePrivileges(@Nullable Set<Privilege> writePrivileges) {
    this.writePrivileges = writePrivileges;
  }
}
