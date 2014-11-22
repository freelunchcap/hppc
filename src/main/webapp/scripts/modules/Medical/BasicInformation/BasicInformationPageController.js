app.controller('BasicInformationPageController', function($scope, $filter, ngTableParams, BasicInformation) {

  $scope.tableParams = new ngTableParams({
    page: 1,
    count: 25
  },{
    counts: [],
    getData: function($defer, params) {
      var query = $filter('hppcParamsFilter')(params);
      BasicInformation.query(query, function (data, responseHeaders) {
        params.total(parseInt(responseHeaders('total')));
        $defer.resolve(data);
      });
    }
  });

  $scope.select = function(record) {
    if($scope.tableParams.$selection == record)
      $scope.tableParams.$selection = null;
    else
      $scope.tableParams.$selection = record;
  };

});