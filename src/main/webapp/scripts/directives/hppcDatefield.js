app.directive('hppcDatefield', function($timeout, $compile) {
  return {
    restrict: 'A',
    link: function($scope, $elem, $attr) {
      var element = $elem[0];
      var id = $attr.id;

      element.removeAttribute('hppc-datefield');
      element.classList.add('hppc-datefield');

      element.setAttribute('datepicker-popup', 'yyyy / M / d');
      element.setAttribute('is-open', '$datefield.' + id);
      element.setAttribute('datepicker-append-to-body', 'true');
      element.setAttribute('placeholder', '年 / 月 / 日');
      element.setAttribute('readonly', '');

      $compile(element)($scope);

      if($scope.$datefield == null)
        $scope.$datefield = {
          $pendingClose: null
        };
      $scope.$datefield[id] = false;

      function toggle() {
        if($scope.$datefield.$pendingClose == id)
          $scope.$datefield.$pendingClose = null;
        else {
          $timeout(function() {
            $scope.$datefield[id] = !$scope.$datefield[id];
          });
        }

      }

      $scope.$watch('$datefield.' + id, function(newValue, oldValue) {
        if(newValue != oldValue) {
          if(newValue) {
            element.classList.add('focus');
          }
          else {
            element.classList.remove('focus');
          }
        }
      });

      var label = document.querySelector('label[for=' + id + ']');
      if(label != null) {
        label.addEventListener('click', function() {
          if($scope.$datefield[id])
            $scope.$datefield.$pendingClose = id;
        });
      }
      element.addEventListener('click', toggle);
    }
  }
});