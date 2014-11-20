app.service('SecurityApi', function($http) {
  return {
    getLoginInformation: function() {
      return $http.get('/api/security/login-information', {});
    },
    getAccessPoints: function() {
      return $http.get('/api/security/access-points', {});
    }
  };
});