package com.beijunyi.hppc.models.data.forms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UrineTestRecord {

  @Id
  @GeneratedValue
  private Integer id;

  private Double bilirubin;
  private Double urobilinogen;
  private Double ketones;
  private Double vitaminC;
  private Double glucose;
  private Double protein;
  private Double blood;
  private Double ph;
  private Double nitrite;
  private Double leukocytes;
  private Double specificGravify;
  private Double color;
  private Double turbidity;
  private Double odor;



}
