app.controller('BiochemistryTestRecordFormController', function($scope, $stateParams, SecurityApi, BiochemistryTestRecord) {

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
    record.timestamp = record.timestamp != null ? new Date(record.timestamp) : undefined;
  }

  if($stateParams.tid != 'new') {
    BiochemistryTestRecord.get({id: $stateParams.tid}, function(record) {
      fixRecord(record);
      $scope.record = record;
      detectChanges();
    });
    $scope.newRecord = false;
  } else {
    $scope.record = new BiochemistryTestRecord();
    $scope.record.timestamp = new Date();
    $scope.record.parentForm = $stateParams.id;
    SecurityApi.getLoginInformation().then(function(loginInformation) {
      $scope.record.docimasterName = loginInformation.alias;
    });
    $scope.newRecord = true;
    detectChanges();
  }

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