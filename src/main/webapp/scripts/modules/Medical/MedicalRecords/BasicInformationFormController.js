app.controller('BasicInformationFormController', function($scope, $stateParams, BasicInformation) {

  function detectChanges() {
    $scope.recordChanged = false;
    var stopFn = $scope.$watch('record', function(newValue, oldValue) {
      if(newValue != oldValue && oldValue != null) {
        stopFn();
        $scope.recordChanged = true;
      }
    }, true);
  }

  function fixDates(record) {
    record.createTimestamp = record.createTimestamp != null ? new Date(record.createTimestamp) : undefined;
    record.petBirthday = record.petBirthday != null ? new Date(record.petBirthday) : undefined;
    record.petNeuterDate = record.petNeuterDate != null ? new Date(record.petNeuterDate) : undefined;
    record.petLastEstrusDate = record.petLastEstrusDate != null ? new Date(record.petLastEstrusDate) : undefined;
    record.petLastPregnantDate = record.petLastPregnantDate != null ? new Date(record.petLastPregnantDate) : undefined;
    record.updateTimestamp = record.updateTimestamp != null ? new Date(record.updateTimestamp) : undefined;
  }

  if($stateParams.id != null) {
    BasicInformation.get({id: $stateParams.id}, function(record) {
      fixDates(record);
      $scope.record = record;
      detectChanges();
    });
    $scope.newRecord = false;
  }
  else {
    $scope.record = new BasicInformation();
    $scope.record.createTimestamp = new Date();
    $scope.newRecord = true;
    detectChanges();
  }

  detectChanges();

  $scope.pending = false;

  $scope.save = function() {
    $scope.pending = true;
    $scope.record.$save(function() {
      $scope.pending = false;
      $scope.newRecord = false;
      fixDates($scope.record);
      detectChanges();
    });
  };

  $scope.check = function() {
    console.log($scope.form);
  };


  $scope.accorionStatus = [true, false, false, false];

});