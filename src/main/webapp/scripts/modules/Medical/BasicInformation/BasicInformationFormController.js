app.controller('BasicInformationFormController', function($scope, $stateParams, BasicInformation) {
  if($stateParams.id != null)
    $scope.record = BasicInformation.get({id: $stateParams.id});
  else {
    $scope.record = new BasicInformation();
    $scope.record.createTimestamp = new Date();
  }

  function detectChanges() {
    $scope.recordChanged = false;
    var stopFn = $scope.$watch('record', function(newValue, oldValue) {
      if(newValue != oldValue) {
        stopFn();
        $scope.recordChanged = true;
      }
    }, true);
  }
  detectChanges();

  $scope.pending = false;

  $scope.save = function() {
    $scope.pending = true;
    $scope.record.$save(function() {
      $scope.pending = false;
      detectChanges();
    });
  }
});