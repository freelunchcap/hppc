app.controller('UrineTestRecordsPageController', function($scope, $state, $stateParams, $filter, ngTableParams, UrineTestRecord) {

  $scope.$stateParams = $stateParams;

  $scope.tableParams = new ngTableParams({
    page: 1,
    count: 25
  },{
    counts: [],
    getData: function($defer, params) {
      var query = $filter('hppcParamsFilter')(params);
      query['match-parentForm'] = $stateParams.id;
      UrineTestRecord.query(query, function (data, responseHeaders) {
        params.total(parseInt(responseHeaders('total')));
        $defer.resolve(data);
        params.$selection = null;
      });
    }
  });

  $scope.select = function(record) {
    $scope.tableParams.$selection = record;
  };

  $scope.edit = function(record) {
    $state.go('medical.record.diagnosis-record', {
      id: $stateParams.id,
      did: record.id
    });
  };
});