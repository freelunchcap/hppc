app.controller('AnnouncementRecordsPageController', function($scope, $filter, ngTableParams, Announcement) {
  $scope.tableParams = new ngTableParams({
    page: 1,
    count: 25
  },{
    counts: [],
    getData: function($defer, params) {
      var query = $filter('hppcParamsFilter')(params);
      Announcement.query(query, function (data, responseHeaders) {
        params.total(parseInt(responseHeaders('total')));
        $defer.resolve(data);
      });
    }
  });

  $scope.select = function(record) {
    $scope.tableParams.$selection = record;
  };

});