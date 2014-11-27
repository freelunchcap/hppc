app.factory('DiagnosisRecord', function($resource) {
  return $resource('/api/medical/diagnosis-record/:id');
});