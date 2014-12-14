package com.beijunyi.hppc.models.data.forms;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "skin_test_record")
public class SkinTestRecord {

  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "parent_form", nullable = false, updatable = false)
  private Integer parentForm;

  @Column(name = "timestamp", nullable = false)
  private Date timestamp;

  @Column(name = "veterinarian_name")
  private String veterinarianName;

  @Column(name = "docimaster_name")
  private String docimasterName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getParentForm() {
    return parentForm;
  }

  public void setParentForm(Integer parentForm) {
    this.parentForm = parentForm;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public String getVeterinarianName() {
    return veterinarianName;
  }

  public void setVeterinarianName(String veterinarianName) {
    this.veterinarianName = veterinarianName;
  }

  public String getDocimasterName() {
    return docimasterName;
  }

  public void setDocimasterName(String docimasterName) {
    this.docimasterName = docimasterName;
  }
}
