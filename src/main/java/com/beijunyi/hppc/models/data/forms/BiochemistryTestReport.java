package com.beijunyi.hppc.models.data.forms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BiochemistryTestReport {

  @Id
  @GeneratedValue
  private Integer id;

  private Double amyl;
  private Double tp;
  private Double ca;
  private Double phos;
  private Double alkp;
  private Double alb;
  private Double alt;
  private Double tbil;
  private Double chol;
  private Double glu;
  private Double crea;
  private Double bun;
  private Double glob;


}
