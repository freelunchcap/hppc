app.directive('announcement', function($timeout) {
  return {
    restrict: 'A',
    templateUrl: 'views/directives/Announcement.html',
    scope: {
      announcement: '='
    }
  };
});