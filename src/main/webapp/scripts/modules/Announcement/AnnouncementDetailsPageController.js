app.controller('AnnouncementDetailsPageController', function($scope, $timeout, $state, $stateParams, Announcement) {

  function detectChanges() {
    $scope.recordChanged = false;
    var stopFn = $scope.$watch('record', function(newValue, oldValue) {
      if(newValue != oldValue && oldValue != null) {
        stopFn();
        $scope.recordChanged = true;
      }
    }, true);
  }

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

  detectChanges();

  $scope.pending = false;
  $scope.save = function() {
    $scope.pending = true;
    $scope.record.$save(function() {
      $state.go('announcement.records')
    });
  };

});