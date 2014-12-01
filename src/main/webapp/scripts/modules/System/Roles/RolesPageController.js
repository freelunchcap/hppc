app.controller('RolesPageController', function($scope, $filter, ngTableParams, SystemApi) {

  $scope.tableParams = new ngTableParams({
    page: 1,
    count: 25
  },{
    counts: [],
    getData: function($defer, params) {
      var query = $filter('hppcParamsFilter')(params);
      SystemApi.queryRoles(query).success(function(data, status, responseHeaders) {
        params.total(parseInt(responseHeaders('total')));
        $defer.resolve(data);
        $scope.tableParams.$selection = null;
      });
    }
  });

  $scope.select = function(record) {
    $scope.tableParams.$selection = record;
  };

});