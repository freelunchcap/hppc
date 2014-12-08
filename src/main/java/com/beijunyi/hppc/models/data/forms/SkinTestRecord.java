package com.beijunyi.hppc.models.data.forms;

import javax.persistence.*;

@Entity
public class SkinTestRecord {

  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;


}
