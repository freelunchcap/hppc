package com.beijunyi.hppc.models.data.forms;

import java.util.Date;
import javax.persistence.*;

@Entity
public class DiagnosisRecord {

  @Id
  @GeneratedValue
  private Integer id;

  @Column(nullable = false, updatable = false)
  private Integer basicInformation;

  @Column(nullable = false, updatable = false)
  private Date timestamp;

  @Column(nullable = false)
  private String diagnosis;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getBasicInformation() {
    return basicInformation;
  }

  public void setBasicInformation(Integer basicInformation) {
    this.basicInformation = basicInformation;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }
}
