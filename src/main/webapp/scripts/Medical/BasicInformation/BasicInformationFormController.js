app.controller('BasicInformationFormController', function($scope, $stateParams, BasicInformation) {
  if($stateParams.id != null)
    $scope.record = BasicInformation.get({id: $stateParams.id});
  else {
    $scope.record = new BasicInformation();
    $scope.record.createTimestamp = new Date();
  }
});