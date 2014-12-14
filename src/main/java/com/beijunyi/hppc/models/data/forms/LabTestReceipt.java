package com.beijunyi.hppc.models.data.forms;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "lab_test_receipt")
public class LabTestReceipt {

  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "parent_form", nullable = false, updatable = false)
  private Integer parentForm;

  @Column(name = "timestamp", nullable = false, updatable = false)
  private Date timestamp;

  @Column(name = "keywords")
  private String keywords;

  @Column(name ="diagnosis", nullable = false)
  private String diagnosis;

  @Column(name = "veterinarian_name", nullable = false)
  private String veterinarianName;

  @Column(name = "supplementary_information")
  private String supplementaryInformation;

}
