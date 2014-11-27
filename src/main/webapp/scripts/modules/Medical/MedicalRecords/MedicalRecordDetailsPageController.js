app.controller('MedicalRecordDetailsPageController', function($scope, $stateParams) {

  $scope.$stateParams = $stateParams;

  $scope.tabs = [
    {
      name: '基本信息',
      sref: 'medical.record.basic-information'
    }
  ];
});