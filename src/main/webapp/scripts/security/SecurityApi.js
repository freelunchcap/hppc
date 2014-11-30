app.service('SecurityApi', function($q, $http) {

  var loginInformation;

  return {
    getLoginInformation: function(refresh) {
      var deferred = $q.defer();
      if(refresh || loginInformation == null) {
        $http.get('/api/security/login-information', {}).success(function(data) {
          loginInformation = data;
          deferred.resolve(loginInformation);
        });
      } else
        deferred.resolve(loginInformation);
      return deferred.promise;
    },
    getAccessPoints: function() {
      return $http.get('/api/security/access-points', {});
    }
  };
});