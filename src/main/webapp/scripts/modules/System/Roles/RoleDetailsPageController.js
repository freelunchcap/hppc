app.controller('RoleDetailsPageController', function($scope, $stateParams, SystemApi) {

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

  if($stateParams.id != 'new') {
    SystemApi.getRole($stateParams.id, function(record) {
      $scope.record = record;
      detectChanges();
    });
    $scope.newRecord = false;
  } else {
    $scope.record = {
      active: true
    };
    detectChanges();
    $scope.newRecord = true;
  }


});