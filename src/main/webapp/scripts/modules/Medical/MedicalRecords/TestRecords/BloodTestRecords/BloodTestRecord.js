app.factory('BloodTestRecord', function($resource) {
  return $resource('/api/medical/blood-test-record/:id');
});