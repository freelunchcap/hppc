app.directive('datefield', function($timeout) {
  return {
    restrict: 'A',
    replace: true,
    templateUrl: 'views/directives/Datefield.html',
    link: function($scope, $elem, $attr) {

      $scope.id = $attr.id;
      document.querySelector('label[for=' + $scope.id + ']').addEventListener('click', function($event) {
        $scope.toggle($event);
      });

      $scope.toggle = function($event, state) {
        if($event != null) {
          $event.preventDefault();
          $event.stopPropagation();
        }
        $timeout(function() {
          $scope.opened = state || !$scope.opened
        });
      };

    }
  }
});