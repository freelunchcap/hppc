app.factory('BasicInformation', function($resource) {
  return $resource('/api/medical/basic-information/:id');
});