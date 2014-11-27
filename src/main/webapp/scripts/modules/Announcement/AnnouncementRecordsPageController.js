app.controller('AnnouncementRecordsPageController', function($scope, $filter, ngTableParams, Announcement, DialogService) {
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
        $scope.tableParams.$selection = null;
      });
    }
  });
  $scope.tableParams.$pageScope = function() {
    return $scope;
  };

  $scope.select = function(record) {
    $scope.tableParams.$selection = record;
  };

  $scope.remove = function(record) {
    DialogService.confirm('移除 ' + record.title, '请确认要永久性地删除 ' + record.title + ' 吗？')
      .result.then(function() {
        record.$delete();
      });
  }

});