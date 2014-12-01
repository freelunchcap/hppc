app.service('SystemApi', function($http) {
  return {
    queryAccounts: function(params) {
      return $http.get('/api/system/accounts', {params: params});
    },
    getAccount: function(id) {
      return $http.get('/api/system/account/' + id, {});
    },
    createAccount: function(account) {
      return $http.post('/api/system/account/create', account);
    },
    updateAccount: function(account) {
      return $http.post('/api/system/account/update', account);
    },
    changeAccountPassword: function(request) {
      return $http.post('/api/system/account/change-password', request);
    },
    changeAccountRoleMapping: function(request) {
      return $http.post('/api/system/account/change-role-mapping', request);
    },
    queryRoles: function(params) {
      return $http.get('/api/system/roles', {params: params});
    },
    getRole: function(id) {
      return $http.get('/api/system/role/' + id, {});
    },
    createRole: function(role) {
      return $http.post('/api/system/role/create', role);
    },
    updateRole: function(role) {
      return $http.post('/api/system/role/update', role);
    },
    changeRolePrivilegeMapping: function(request) {
      return $http.post('/api/system/role/change-privilege-mapping', request);
    },
    queryPrivileges: function(params) {
      return $http.get('/api/system/privileges', {params: params});
    },
    getPrivilege: function(id) {
      return $http.get('/api/system/privilege/' + id, {});
    },
    createPrivilege: function(privilege) {
      return $http.post('/api/system/privilege/create', privilege);
    },
    updatePrivilege: function(privilege) {
      return $http.post('/api/system/privilege/update', privilege);
    }
  };
});