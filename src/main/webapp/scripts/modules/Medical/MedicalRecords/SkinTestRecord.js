app.factory('SkinTestRecord', function($resource) {
  return $resource('/api/medical/skin-test-record/:id');
});