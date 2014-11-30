package com.beijunyi.hppc.models.data.forms;

import java.util.Date;
import javax.persistence.*;

@Entity
public class DiagnosisRecord {

  @Id
  @GeneratedValue
  private Integer id;

  @Column(name = "parent_form", nullable = false, updatable = false)
  private Integer parentForm;

  @Column(name = "timestamp", nullable = false, updatable = false)
  private Date timestamp;

  @Column(name = "keywords")
  private String keywords;

  @Column(name ="diagnosis", nullable = false)
  private String diagnosis;

  @Column(name = "doctor_name", nullable = false)
  private String doctorName;

  @Column(name = "supplementary_information")
  private String supplementaryInformation;

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

  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }

  public String getSupplementaryInformation() {
    return supplementaryInformation;
  }

  public void setSupplementaryInformation(String supplementaryInformation) {
    this.supplementaryInformation = supplementaryInformation;
  }
}
