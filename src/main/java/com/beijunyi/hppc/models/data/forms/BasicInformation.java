package com.beijunyi.hppc.models.data.forms;

import java.util.Date;
import javax.persistence.*;

@Entity
public class BasicInformation {

  public static final String ACCESS_POINT = BasicInformation.class.getSimpleName();

  @Id
  @GeneratedValue
  private Integer id;

  @Column(nullable = false, updatable = false)
  private Date createTimestamp;

  @Column(nullable = false)
  private String ownerName;

  private String address;

  private String postCode;

  @Column(nullable = false)
  private String cellPhone;

  private String email;

  @Column(nullable = false)
  private String petName;

  @Column(nullable = false)
  private Double petWeight;

  @Column(nullable = false)
  private String petType;

  private String otherPetType;

  @Column(nullable = false)
  private Date petBirthday;

  @Column(nullable = false)
  private String petBreed;

  @Column(nullable = false)
  private String petColor;

  @Column(nullable = false)
  private String petGender;

  @Column(nullable = false)
  private Boolean petNeutered;

  private Date petNeuterDate;

  private String petSource;

  private Double petAdoptedAge;

  private String petLivingCondition;

  private String petLivingConditionChanges;

  private String petBehaviour;

  private String petBehaviourChanges;

  private String petWaterDrinkingStatus;

  private String petFood;

  private String petFoodBrand;

  private String petFeedingFrequency;

  private String petFoodContainer;

  private String otherPetFoodContainer;

  private String petFoodChanges;

  private Boolean petRegularEstrusCycle;

  private Date petLastEstrusDate;

  private Date petLastPregnantDate;

  private Boolean petObviousMaleBehavious;

  private String petHistoryIllnessesAndSurgeries;

  private Date updateTimestamp;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getCreateTimestamp() {
    return createTimestamp;
  }

  public void setCreateTimestamp(Date createTimestamp) {
    this.createTimestamp = createTimestamp;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPetName() {
    return petName;
  }

  public void setPetName(String petName) {
    this.petName = petName;
  }

  public Double getPetWeight() {
    return petWeight;
  }

  public void setPetWeight(Double petWeight) {
    this.petWeight = petWeight;
  }

  public String getPetType() {
    return petType;
  }

  public void setPetType(String petType) {
    this.petType = petType;
  }

  public String getOtherPetType() {
    return otherPetType;
  }

  public void setOtherPetType(String otherPetType) {
    this.otherPetType = otherPetType;
  }

  public Date getPetBirthday() {
    return petBirthday;
  }

  public void setPetBirthday(Date petBirthday) {
    this.petBirthday = petBirthday;
  }

  public String getPetBreed() {
    return petBreed;
  }

  public void setPetBreed(String petBreed) {
    this.petBreed = petBreed;
  }

  public String getPetColor() {
    return petColor;
  }

  public void setPetColor(String petColor) {
    this.petColor = petColor;
  }

  public String getPetGender() {
    return petGender;
  }

  public void setPetGender(String petGender) {
    this.petGender = petGender;
  }

  public Boolean getPetNeutered() {
    return petNeutered;
  }

  public void setPetNeutered(Boolean petNeutered) {
    this.petNeutered = petNeutered;
  }

  public Date getPetNeuterDate() {
    return petNeuterDate;
  }

  public void setPetNeuterDate(Date petNeuterDate) {
    this.petNeuterDate = petNeuterDate;
  }

  public String getPetSource() {
    return petSource;
  }

  public void setPetSource(String petSource) {
    this.petSource = petSource;
  }

  public Double getPetAdoptedAge() {
    return petAdoptedAge;
  }

  public void setPetAdoptedAge(Double petAdoptedAge) {
    this.petAdoptedAge = petAdoptedAge;
  }

  public String getPetLivingCondition() {
    return petLivingCondition;
  }

  public void setPetLivingCondition(String petLivingCondition) {
    this.petLivingCondition = petLivingCondition;
  }

  public String getPetLivingConditionChanges() {
    return petLivingConditionChanges;
  }

  public void setPetLivingConditionChanges(String petLivingConditionChanges) {
    this.petLivingConditionChanges = petLivingConditionChanges;
  }

  public String getPetBehaviour() {
    return petBehaviour;
  }

  public void setPetBehaviour(String petBehaviour) {
    this.petBehaviour = petBehaviour;
  }

  public String getPetBehaviourChanges() {
    return petBehaviourChanges;
  }

  public void setPetBehaviourChanges(String petBehaviourChanges) {
    this.petBehaviourChanges = petBehaviourChanges;
  }

  public String getPetWaterDrinkingStatus() {
    return petWaterDrinkingStatus;
  }

  public void setPetWaterDrinkingStatus(String petWaterDrinkingStatus) {
    this.petWaterDrinkingStatus = petWaterDrinkingStatus;
  }

  public String getPetFood() {
    return petFood;
  }

  public void setPetFood(String petFood) {
    this.petFood = petFood;
  }

  public String getPetFoodBrand() {
    return petFoodBrand;
  }

  public void setPetFoodBrand(String petFoodBrand) {
    this.petFoodBrand = petFoodBrand;
  }

  public String getPetFeedingFrequency() {
    return petFeedingFrequency;
  }

  public void setPetFeedingFrequency(String petFeedingFrequency) {
    this.petFeedingFrequency = petFeedingFrequency;
  }

  public String getPetFoodContainer() {
    return petFoodContainer;
  }

  public void setPetFoodContainer(String petFoodContainer) {
    this.petFoodContainer = petFoodContainer;
  }

  public String getOtherPetFoodContainer() {
    return otherPetFoodContainer;
  }

  public void setOtherPetFoodContainer(String otherPetFoodContainer) {
    this.otherPetFoodContainer = otherPetFoodContainer;
  }

  public String getPetFoodChanges() {
    return petFoodChanges;
  }

  public void setPetFoodChanges(String petFoodChanges) {
    this.petFoodChanges = petFoodChanges;
  }

  public Boolean getPetRegularEstrusCycle() {
    return petRegularEstrusCycle;
  }

  public void setPetRegularEstrusCycle(Boolean petRegularEstrusCycle) {
    this.petRegularEstrusCycle = petRegularEstrusCycle;
  }

  public Date getPetLastEstrusDate() {
    return petLastEstrusDate;
  }

  public void setPetLastEstrusDate(Date petLastEstrusDate) {
    this.petLastEstrusDate = petLastEstrusDate;
  }

  public Date getPetLastPregnantDate() {
    return petLastPregnantDate;
  }

  public void setPetLastPregnantDate(Date petLastPregnantDate) {
    this.petLastPregnantDate = petLastPregnantDate;
  }

  public Boolean getPetObviousMaleBehavious() {
    return petObviousMaleBehavious;
  }

  public void setPetObviousMaleBehavious(Boolean petObviousMaleBehavious) {
    this.petObviousMaleBehavious = petObviousMaleBehavious;
  }

  public String getPetHistoryIllnessesAndSurgeries() {
    return petHistoryIllnessesAndSurgeries;
  }

  public void setPetHistoryIllnessesAndSurgeries(String petHistoryIllnessesAndSurgeries) {
    this.petHistoryIllnessesAndSurgeries = petHistoryIllnessesAndSurgeries;
  }

  public Date getUpdateTimestamp() {
    return updateTimestamp;
  }

  public void setUpdateTimestamp(Date updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }
}
