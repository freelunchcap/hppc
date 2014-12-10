app.factory('FecesTestRecord', function($resource) {
  return $resource('/api/medical/feces-test-record/:id');
});