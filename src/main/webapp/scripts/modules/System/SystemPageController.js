app.controller('SystemPageController', function($scope, $state, $stateParams) {
  $scope.$stateParams = $stateParams;

  $scope.tabs = [
    {
      title: '账号',
      sref: 'system.accounts'
    }, {
      title: '职责',
      sref: 'medical.roles'
    }, {
      title: '权限',
      sref: 'medical.privileges'
    }
  ];

  angular.forEach($scope.tabs, function(tab, index) {
    var matchedStates = [$state.current.name];
    if($state.current.data != null && $state.current.data.parents != null)
      matchedStates = matchedStates.concat($state.current.data.parents);
    tab.$active = matchedStates.indexOf(tab.sref) != -1;
    tab.$show = index == 0 || $stateParams.id != 'new'
  });
});