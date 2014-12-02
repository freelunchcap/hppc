app.factory('BiochemistryTestRecord', function($resource) {
  return $resource('/api/medical/biochemistry-test-record/:id');
});