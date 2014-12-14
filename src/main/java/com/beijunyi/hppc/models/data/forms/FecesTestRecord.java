package com.beijunyi.hppc.models.data.forms;

import javax.persistence.*;

@Entity
@Table(name = "feces_test_record")
public class FecesTestRecord {

  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "parent_form", nullable = false, updatable = false)
  private Integer parentForm;

  @Column(name = "veterinarian_name")
  private String veterinarianName;

  @Column(name = "docimaster_name")
  private String docimasterName;

  private String samplingMethod;

  private String shape;

  private String color;

  private String odor;

  private String usualMixture;

  private String microscopeMethod;

  private String residual;

  private Boolean ascarid;

  private Boolean nematode;

  private Boolean cestode;

  private Boolean coccidium;

  private Boolean trematode;



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
