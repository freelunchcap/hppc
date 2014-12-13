package com.beijunyi.hppc.models.data.forms;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "blood_test_record")
public class BloodTestRecord {

  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "parent_form", nullable = false, updatable = false)
  private Integer parentForm;

  @Column(name = "timestamp", nullable = false)
  private Date timestamp;

  @Column(name = "veterinarian_name", nullable = false)
  private String veterinarianName;

  @Column(name = "docimaster_name", nullable = false)
  private String docimasterName;

  @Column(name = "hct")
  private Double hct;

  @Column(name = "hcb")
  private Double hcb;

  @Column(name = "wbc")
  private Double wbc;

  @Column(name = "plt")
  private Double plt;

  @Column(name = "gran_rate")
  private Double granRate;

  @Column(name = "gran")
  private Double gran;

  @Column(name = "lym_rate")
  private Double lymRate;

  @Column(name = "lym")
  private Double lym;

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

  public Double getHct() {
    return hct;
  }

  public void setHct(Double hct) {
    this.hct = hct;
  }

  public Double getHcb() {
    return hcb;
  }

  public void setHcb(Double hcb) {
    this.hcb = hcb;
  }

  public Double getWbc() {
    return wbc;
  }

  public void setWbc(Double wbc) {
    this.wbc = wbc;
  }

  public Double getPlt() {
    return plt;
  }

  public void setPlt(Double plt) {
    this.plt = plt;
  }

  public Double getGranRate() {
    return granRate;
  }

  public void setGranRate(Double granRate) {
    this.granRate = granRate;
  }

  public Double getGran() {
    return gran;
  }

  public void setGran(Double gran) {
    this.gran = gran;
  }

  public Double getLymRate() {
    return lymRate;
  }

  public void setLymRate(Double lymRate) {
    this.lymRate = lymRate;
  }

  public Double getLym() {
    return lym;
  }

  public void setLym(Double lym) {
    this.lym = lym;
  }

  public String getSupplementaryInformation() {
    return supplementaryInformation;
  }

  public void setSupplementaryInformation(String supplementaryInformation) {
    this.supplementaryInformation = supplementaryInformation;
  }
}
