app.factory('BasicInformationApi', function($resource) {
  return $resource('/api/medical/basic-information/:id');
});