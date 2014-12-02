app.factory('UrineTestRecord', function($resource) {
  return $resource('/api/medical/urine-test-record/:id');
});