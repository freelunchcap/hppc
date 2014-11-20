app.controller('NavigationController', function($scope, SecurityApi) {
  $scope.departments = [
    {
      name: '医疗部',
      state: 'medical'
    }
  ];

  SecurityApi.getLoginInformation().success(function(loginInformation) {
    $scope.loginInformation = loginInformation;
  });

});