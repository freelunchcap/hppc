app.controller('DiagnosisRecordsPageController', function($scope, $stateParams, $filter, ngTableParams, DiagnosisRecord) {

  $scope.tableParams = new ngTableParams({
    page: 1,
    count: 25
  },{
    counts: [],
    getData: function($defer, params) {
      var query = $filter('hppcParamsFilter')(params);
      query['match-parent'] = $stateParams.id;
      DiagnosisRecord.query(query, function (data, responseHeaders) {
        params.total(parseInt(responseHeaders('total')));
        $defer.resolve(data);
        params.$selection = null;
      });
      params.$stateParams = function() {
        return $stateParams;
      }
    }
  });

  $scope.$stateParams = $stateParams;


  $scope.select = function(record) {
    $scope.tableParams.$selection = record;
  };

});