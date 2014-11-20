app.controller('BasicInformationPageController', function($scope, $filter, ngTableParams, BasicInformation) {

  $scope.tableParams = new ngTableParams({
    page: 1,
    count: 25
  },{
    counts: [],
    getData: function($defer, params) {
      var query = $filter('hppcParamsFilter')(params);
      BasicInformation.query(query, function (data, responseHeaders) {
        params.total(responseHeaders.total);
        $defer.resolve(data);
      });
    }
  });

});