app.controller('MedicalRecordDetailsPageController', function($scope, $stateParams) {

  $scope.$stateParams = $stateParams;

  $scope.tabs = [
    {
      title: '基本信息',
      sref: 'medical.record.basic-information'
    }
  ];
});