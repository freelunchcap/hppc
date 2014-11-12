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

  private Integer documentId;

  private Integer ownerName;

  private String address;

  private String postCode;

  private String cellPhone;

  private String email;

  private String petName;

  private Integer petWeight;

  @Enumerated(EnumType.STRING)
  private PetType petType;

  private String otherPetType;

  private Date petBirthday;

  private String petBreed;

  private String petColor;

  @Enumerated(EnumType.STRING)
  private PetGender petGender;

  private Boolean petNeutered;

  private Date petNeuterDate;

  @Enumerated(EnumType.STRING)
  private PetSource petSource;

  private Double petAdoptedAge;

  @ElementCollection
  @Enumerated(EnumType.STRING)
  private Set<PetLivingCondition> petLivingConditions;

  private String petLivingConditionChanges;

  @ElementCollection
  @Enumerated(EnumType.STRING)
  private Set<PetBehaviour> petBehaviours;

  private String petBehaviourChanges;

  @Enumerated(EnumType.STRING)
  private PetWaterDrinkingStatus petWaterDrinkingStatus;

  @ElementCollection
  @Enumerated(EnumType.STRING)
  private Set<PetFood> petFoods;

  private String petFoodBrand;

  @Enumerated(EnumType.STRING)
  private PetFeedingFrequency petFeedingFrequency;

  @Enumerated(EnumType.STRING)
  private PetFoodContainer petFoodContainer;

  private String otherPetFoodContainer;

  private String petFoodChanges;

  private Boolean petRegularEstrusCycle;

  private Date petLastEstrusDate;

  private Date petLastPregnantDate;

  private Boolean petObviousMailBehavious;

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

  public Integer getDocumentId() {
    return documentId;
  }

  public void setDocumentId(Integer documentId) {
    this.documentId = documentId;
  }

  public Integer getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(Integer ownerName) {
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

  public PetType getPetType() {
    return petType;
  }

  public void setPetType(PetType petType) {
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

  public PetGender getPetGender() {
    return petGender;
  }

  public void setPetGender(PetGender petGender) {
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

  public PetSource getPetSource() {
    return petSource;
  }

  public void setPetSource(PetSource petSource) {
    this.petSource = petSource;
  }

  public Double getPetAdoptedAge() {
    return petAdoptedAge;
  }

  public void setPetAdoptedAge(Double petAdoptedAge) {
    this.petAdoptedAge = petAdoptedAge;
  }

  public Set<PetLivingCondition> getPetLivingConditions() {
    return petLivingConditions;
  }

  public void setPetLivingConditions(Set<PetLivingCondition> petLivingConditions) {
    this.petLivingConditions = petLivingConditions;
  }

  public String getPetLivingConditionChanges() {
    return petLivingConditionChanges;
  }

  public void setPetLivingConditionChanges(String petLivingConditionChanges) {
    this.petLivingConditionChanges = petLivingConditionChanges;
  }

  public Set<PetBehaviour> getPetBehaviours() {
    return petBehaviours;
  }

  public void setPetBehaviours(Set<PetBehaviour> petBehaviours) {
    this.petBehaviours = petBehaviours;
  }

  public String getPetBehaviourChanges() {
    return petBehaviourChanges;
  }

  public void setPetBehaviourChanges(String petBehaviourChanges) {
    this.petBehaviourChanges = petBehaviourChanges;
  }

  public PetWaterDrinkingStatus getPetWaterDrinkingStatus() {
    return petWaterDrinkingStatus;
  }

  public void setPetWaterDrinkingStatus(PetWaterDrinkingStatus petWaterDrinkingStatus) {
    this.petWaterDrinkingStatus = petWaterDrinkingStatus;
  }

  public Set<PetFood> getPetFoods() {
    return petFoods;
  }

  public void setPetFoods(Set<PetFood> petFoods) {
    this.petFoods = petFoods;
  }

  public String getPetFoodBrand() {
    return petFoodBrand;
  }

  public void setPetFoodBrand(String petFoodBrand) {
    this.petFoodBrand = petFoodBrand;
  }

  public PetFeedingFrequency getPetFeedingFrequency() {
    return petFeedingFrequency;
  }

  public void setPetFeedingFrequency(PetFeedingFrequency petFeedingFrequency) {
    this.petFeedingFrequency = petFeedingFrequency;
  }

  public PetFoodContainer getPetFoodContainer() {
    return petFoodContainer;
  }

  public void setPetFoodContainer(PetFoodContainer petFoodContainer) {
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

  public Boolean getPetObviousMailBehavious() {
    return petObviousMailBehavious;
  }

  public void setPetObviousMailBehavious(Boolean petObviousMailBehavious) {
    this.petObviousMailBehavious = petObviousMailBehavious;
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
