package com.beijunyi.hppc.models.data.forms;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "basic_information")
public class BasicInformation {

  public static final String ACCESS_POINT = BasicInformation.class.getSimpleName();

  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "create_timestamp", nullable = false, updatable = false)
  private Date createTimestamp;

  @Column(name = "owner_name", nullable = false)
  private String ownerName;

  @Column(name = "address")
  private String address;

  @Column(name = "post_code")
  private String postCode;

  @Column(name = "cell_phone", nullable = false)
  private String cellPhone;

  @Column(name = "email")
  private String email;

  @Column(name = "pet_name", nullable = false)
  private String petName;

  @Column(name = "pet_weight", nullable = false)
  private Double petWeight;

  @Column(name = "pet_type", nullable = false)
  private String petType;

  @Column(name = "other_pet_type")
  private String otherPetType;

  @Column(name = "pet_birthday", nullable = false)
  private Date petBirthday;

  @Column(name = "pet_breed", nullable = false)
  private String petBreed;

  @Column(name = "pet_color", nullable = false)
  private String petColor;

  @Column(name = "pet_gender", nullable = false)
  private String petGender;

  @Column(name = "pet_neutered", nullable = false)
  private Boolean petNeutered;

  @Column(name = "pet_neuter_date")
  private Date petNeuterDate;

  @Column(name = "pet_source")
  private String petSource;

  @Column(name = "pet_adopted_age")
  private Double petAdoptedAge;

  @Column(name = "pet_living_condition")
  private String petLivingCondition;

  @Column(name = "pet_living_condition_changes")
  private String petLivingConditionChanges;

  @Column(name = "pet_behaviour")
  private String petBehaviour;

  @Column(name = "pet_behaviour_changes")
  private String petBehaviourChanges;

  @Column(name = "pet_water_drinking_status")
  private String petWaterDrinkingStatus;

  @Column(name = "pet_food")
  private String petFood;

  @Column(name = "pet_food_brand")
  private String petFoodBrand;

  @Column(name = "pet_feeding_frequency")
  private String petFeedingFrequency;

  @Column(name = "pet_food_container")
  private String petFoodContainer;

  @Column(name = "other_pet_food_container")
  private String otherPetFoodContainer;

  @Column(name = "pet_food_changes")
  private String petFoodChanges;

  @Column(name = "pet_regular_estrus_cycle")
  private Boolean petRegularEstrusCycle;

  @Column(name = "pet_last_estrus_date")
  private Date petLastEstrusDate;

  @Column(name = "pet_last_pregnant_date")
  private Date petLastPregnantDate;

  @Column(name = "pet_obvious_male_behaviours")
  private Boolean petObviousMaleBehaviours;

  @Column(name = "pet_history_illnesses_and_surgeries")
  private String petHistoryIllnessesAndSurgeries;

  @Column(name = "update_timestamp")
  private Date updateTimestamp;

  @Column(name = "supplementary_information")
  private String supplementaryInformation;

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

  public Boolean getPetObviousMaleBehaviours() {
    return petObviousMaleBehaviours;
  }

  public void setPetObviousMaleBehaviours(Boolean petObviousMaleBehaviours) {
    this.petObviousMaleBehaviours = petObviousMaleBehaviours;
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
