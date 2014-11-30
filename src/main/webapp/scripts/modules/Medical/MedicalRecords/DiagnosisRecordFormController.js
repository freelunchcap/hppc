app.controller('DiagnosisRecordFormController', function($scope, $stateParams, SecurityApi, DiagnosisRecord) {

  $scope.$stateParams = $stateParams;

  function detectChanges() {
    $scope.recordChanged = false;
    var stopFn = $scope.$watch('record', function(newValue, oldValue) {
      if(newValue != oldValue && oldValue != null) {
        stopFn();
        $scope.recordChanged = true;
      }
    }, true);
  }

  function fixRecord(record) {

  }

  if($stateParams.did != 'new') {
    DiagnosisRecord.get({id: $stateParams.did}, function(record) {
      fixRecord(record);
      $scope.record = record;
      detectChanges();
    });
    $scope.newRecord = false;
  } else {
    $scope.record = new DiagnosisRecord();
    $scope.record.timestamp = new Date();
    $scope.record.parentForm = $stateParams.id;
    SecurityApi.getLoginInformation().then(function(loginInformation) {
      $scope.record.doctorName = loginInformation.alias;
    });
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
      fixRecord($scope.record);
      detectChanges();
    });
  };

});