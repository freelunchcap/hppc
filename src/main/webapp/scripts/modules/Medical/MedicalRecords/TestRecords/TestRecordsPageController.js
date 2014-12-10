app.controller('TestRecordsPageController', function($scope, $stateParams, ngTableParams) {

  $scope.$stateParams = $stateParams;

  $scope.types = [
    {
      title: '血常规化验单',
      sref: 'medical.record.blood-test-records'
    }, {
      title: '生化检验单',
      sref: 'medical.record.biochemistry-test-records'
    }, {
      title: '尿液检验单',
      sref: 'medical.record.urine-test-records'
    }, {
      title: '抗原抗体检查',
      sref: 'medical.record.antigen-antibody-test-records'
    }, {
      title: '粪便检查单',
      sref: 'medical.record.feces-test-records'
    }
  ];

  $scope.tableParams = new ngTableParams({
    page: 1,
    count: 25
  },{
    counts: [],
    getData: function($defer) {
      $defer.resolve($scope.types);
    }
  });


});