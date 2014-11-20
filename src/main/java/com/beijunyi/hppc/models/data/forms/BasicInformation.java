package com.beijunyi.hppc.models.data.forms;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
public class BasicInformation {

  public static final String ACCESS_POINT = BasicInformation.class.getSimpleName();

  @Id
  @GeneratedValue
  private int id;

  private Date createTimestamp;

  private String ownerName;

  private String address;

  private String postCode;

  private String cellPhone;

  private String email;

  private String petName;

  private Integer petWeight;

  private String petType;

  private String otherPetType;

  private Date petBirthday;

  private String petBreed;

  private String petColor;

  private String petGender;

  private Boolean petNeutered;

  private Date petNeuterDate;

  private String petSource;

  private Double petAdoptedAge;

  @ElementCollection(fetch = FetchType.EAGER)
  private Set<String> petLivingConditions;

  private String petLivingConditionChanges;

  @ElementCollection(fetch = FetchType.EAGER)
  private Set<String> petBehaviours;

  private String petBehaviourChanges;

  private String petWaterDrinkingStatus;

  @ElementCollection(fetch = FetchType.EAGER)
  private Set<String> petFoods;

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

  public int getId() {
    return id;
  }

  public void setId(int id) {
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

  public Integer getPetWeight() {
    return petWeight;
  }

  public void setPetWeight(Integer petWeight) {
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

  public Set<String> getPetLivingConditions() {
    return petLivingConditions;
  }

  public void setPetLivingConditions(Set<String> petLivingConditions) {
    this.petLivingConditions = petLivingConditions;
  }

  public String getPetLivingConditionChanges() {
    return petLivingConditionChanges;
  }

  public void setPetLivingConditionChanges(String petLivingConditionChanges) {
    this.petLivingConditionChanges = petLivingConditionChanges;
  }

  public Set<String> getPetBehaviours() {
    return petBehaviours;
  }

  public void setPetBehaviours(Set<String> petBehaviours) {
    this.petBehaviours = petBehaviours;
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

  public Set<String> getPetFoods() {
    return petFoods;
  }

  public void setPetFoods(Set<String> petFoods) {
    this.petFoods = petFoods;
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
