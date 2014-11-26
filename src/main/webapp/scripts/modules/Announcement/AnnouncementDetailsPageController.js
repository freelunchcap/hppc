app.controller('AnnouncementDetailsPageController', function($scope, $timeout, $stateParams, Announcement) {

  function updateTimestamp(record, interval) {
    $timeout(function() {
      record.timestamp = new Date();
      updateTimestamp(record, interval);
    }, interval);
  }

  if($stateParams.id != 'new') {
    Announcement.get({id: $stateParams.id}, function(record) {
      $scope.record = record;
    });
    $scope.newRecord = false;
  } else {
    $scope.record = new Announcement();
    $scope.record.timestamp = new Date();
    $scope.record.type = 'info';
    $scope.newRecord = true;
    updateTimestamp($scope.record, 1000);
  }
});