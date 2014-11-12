app.controller('BasicInformationFormController', function($scope) {
  $scope.today = function() {
    $scope.dt = new Date();
  };
  $scope.today();

  $scope.clear = function () {
    $scope.dt = null;
  };

  $scope.open = function($event) {
    $scope.opened = !$scope.opened;
    $event.preventDefault();
    $event.stopPropagation();
  };

});