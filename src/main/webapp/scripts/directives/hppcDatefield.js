app.directive('hppcDatefield', function($timeout, $compile) {
  return {
    restrict: 'A',
    link: function($scope, $elem, $attr) {
      var element = $elem[0];
      var id = $attr.id;

      element.removeAttribute('hppc-datefield');

      element.setAttribute('datepicker-popup', 'dd-MM-yyyy');
      element.setAttribute('is-open', '$datefield.' + id);
      element.setAttribute('readonly', '');

      $compile(element)($scope);

      if($scope.$datefield == null)
        $scope.$datefield = {
          $opened: null
        };
      $scope.$datefield[id] = false;

      function toggle() {
        $timeout(function() {
          if($scope.$datefield[id] = !$scope.$datefield[id])
            $scope.$datefield.$opened = id;
          else
            $scope.$datefield.$opened = null;
        });
      }

      $scope.$watch('$datefield.' + id, function(newValue, oldValue) {
        if(newValue != oldValue) {
          if(newValue)
            element.classList.add('focus');
          else
            element.classList.remove('focus');
        }
      });

      document.querySelector('label[for=' + id + ']').addEventListener('click', function($event) {
        $event.preventDefault();
        $event.stopPropagation();
        if($scope.$datefield.$opened != null && $scope.$datefield.$opened != id) {
          $scope.$datefield[$scope.$datefield.$opened] = false;
          $scope.$datefield.$opened = null;
        }
        toggle();
      });
      element.addEventListener('click', toggle);
    }
  }
});