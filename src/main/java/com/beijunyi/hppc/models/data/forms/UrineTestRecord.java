package com.beijunyi.hppc.models.data.forms;

import javax.persistence.*;

@Entity
public class UrineTestRecord {

  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "bilirubin")
  private Double bilirubin;

  @Column(name = "urobilinogen")
  private Double urobilinogen;

  @Column(name = "ketones")
  private Double ketones;

  @Column(name = "vitamin_c")
  private Double vitaminC;

  @Column(name = "glucose")
  private Double glucose;

  @Column(name = "protein")
  private Double protein;

  @Column(name = "blood")
  private Double blood;

  @Column(name = "ph")
  private Double ph;

  @Column(name = "nitrite")
  private Double nitrite;

  @Column(name = "leukocytes")
  private Double leukocytes;

  @Column(name = "specific_gravify")
  private Double specificGravify;

  @Column(name = "color")
  private Double color;

  @Column(name = "turbidity")
  private Double turbidity;

  @Column(name = "odor")
  private Double odor;

  @Column(name = "supplementary_information")
  private String supplementaryInformation;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Double getBilirubin() {
    return bilirubin;
  }

  public void setBilirubin(Double bilirubin) {
    this.bilirubin = bilirubin;
  }

  public Double getUrobilinogen() {
    return urobilinogen;
  }

  public void setUrobilinogen(Double urobilinogen) {
    this.urobilinogen = urobilinogen;
  }

  public Double getKetones() {
    return ketones;
  }

  public void setKetones(Double ketones) {
    this.ketones = ketones;
  }

  public Double getVitaminC() {
    return vitaminC;
  }

  public void setVitaminC(Double vitaminC) {
    this.vitaminC = vitaminC;
  }

  public Double getGlucose() {
    return glucose;
  }

  public void setGlucose(Double glucose) {
    this.glucose = glucose;
  }

  public Double getProtein() {
    return protein;
  }

  public void setProtein(Double protein) {
    this.protein = protein;
  }

  public Double getBlood() {
    return blood;
  }

  public void setBlood(Double blood) {
    this.blood = blood;
  }

  public Double getPh() {
    return ph;
  }

  public void setPh(Double ph) {
    this.ph = ph;
  }

  public Double getNitrite() {
    return nitrite;
  }

  public void setNitrite(Double nitrite) {
    this.nitrite = nitrite;
  }

  public Double getLeukocytes() {
    return leukocytes;
  }

  public void setLeukocytes(Double leukocytes) {
    this.leukocytes = leukocytes;
  }

  public Double getSpecificGravify() {
    return specificGravify;
  }

  public void setSpecificGravify(Double specificGravify) {
    this.specificGravify = specificGravify;
  }

  public Double getColor() {
    return color;
  }

  public void setColor(Double color) {
    this.color = color;
  }

  public Double getTurbidity() {
    return turbidity;
  }

  public void setTurbidity(Double turbidity) {
    this.turbidity = turbidity;
  }

  public Double getOdor() {
    return odor;
  }

  public void setOdor(Double odor) {
    this.odor = odor;
  }

  public String getSupplementaryInformation() {
    return supplementaryInformation;
  }

  public void setSupplementaryInformation(String supplementaryInformation) {
    this.supplementaryInformation = supplementaryInformation;
  }
}
