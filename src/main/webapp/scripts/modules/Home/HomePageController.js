app.controller('HomePageController', function($scope, $filter, ngTableParams, Announcement) {

  Announcement.query({
    'sort-key': 'timestamp',
    'sort-dir': 'DESC',
    'find-total': false,
    size: 10
  }, function(data) {
    $scope.announcements = data;
  });

});