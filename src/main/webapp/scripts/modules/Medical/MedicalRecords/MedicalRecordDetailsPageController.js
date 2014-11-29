app.controller('MedicalRecordDetailsPageController', function($scope, $state, $stateParams) {

  $scope.$stateParams = $stateParams;

  $scope.tabs = [
    {
      title: '基本信息',
      sref: 'medical.record.basic-information'
    }, {
      title: '诊断记录',
      sref: 'medical.record.diagnosis-records'
    }
  ];

  angular.forEach($scope.tabs, function(tab, index) {
    var matchedStates = [$state.current.name];
    if($state.current.data.parents != null)
      matchedStates = matchedStates.concat($state.current.data.parents)
    tab.$active = matchedStates.indexOf(tab.sref) != -1;
    tab.$show = index == 0 || $stateParams.id != 'new'
  })


});