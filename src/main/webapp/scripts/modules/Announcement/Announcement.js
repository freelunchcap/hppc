app.factory('Announcement', function($resource) {
  return $resource('/api/announcement/:id');
});