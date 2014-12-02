package com.beijunyi.hppc.models.data.forms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BloodTestRecord {

  @Id
  @GeneratedValue
  private Integer id;

  private Double htc;
  private Double hcb;
  private Double wbc;
  private Double plt;
  private Double granRate;
  private Double gran;
  private Double lymRate;
  private Double lym;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Double getHtc() {
    return htc;
  }

  public void setHtc(Double htc) {
    this.htc = htc;
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
}
