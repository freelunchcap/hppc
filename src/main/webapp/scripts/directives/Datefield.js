app.directive('datefield', function($timeout, $compile) {
  return {
    restrict: 'A',
    link: function($scope, $elem, $attr) {
      var element = $elem[0];

      element.removeAttribute('datefield');

      element.setAttribute('datepicker-popup', 'dd-MM-yyyy');
      element.setAttribute('is-open', 'opened');
      element.setAttribute('readonly', '');

      $elem.html($compile(element)($scope));

      function toggle($event) {
        if($event != null) {
          $event.preventDefault();
          $event.stopPropagation();
        }
        $timeout(function() {
          $scope.opened = !$scope.opened;
        });
      }

      $scope.opened = false;
      $scope.$watch('opened', function(newValue, oldValue) {
        if(newValue != oldValue) {
          if(newValue)
            element.classList.add('focus');
          else
            element.classList.remove('focus');
        }
      });

      $scope.id = $attr.id;
      document.querySelector('label[for=' + $scope.id + ']').addEventListener('click', toggle);
      element.addEventListener('click', toggle);
    }
  }
});