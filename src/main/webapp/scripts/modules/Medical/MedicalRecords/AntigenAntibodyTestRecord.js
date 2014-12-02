app.factory('AntigenAntibodyTestRecord', function($resource) {
  return $resource('/api/medical/antigen-antibody-test-record/:id');
});