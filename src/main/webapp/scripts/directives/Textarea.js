app.directive('textarea', function($timeout) {
  return {
    link: function($scope, $element) {
      $timeout(function() {
        $element.autosize();
      });
    }
  };
});