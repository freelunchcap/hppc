app.controller('DiagnosisRecordFormController', function($scope, $stateParams, DiagnosisRecord) {

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

  if($stateParams.id != 'new') {
    DiagnosisRecord.get({id: $stateParams.id}, function(record) {
      fixRecord(record);
      $scope.record = record;
      detectChanges();
    });
    $scope.newRecord = false;
  } else {
    $scope.record = new DiagnosisRecord();
    $scope.record.timestamp = new Date();
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