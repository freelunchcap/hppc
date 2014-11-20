app.service('AdminApi', function($http) {
  return {
    queryAccounts: function(params) {
      return $http.get('/api/admin/accounts', {params: params});
    },
    createAccount: function(account) {
      return $http.post('/api/admin/account/create', account);
    },
    updateAccount: function(account) {
      return $http.post('/api/admin/account/update', account);
    },
    changeAccountPassword: function(request) {
      return $http.post('/api/admin/account/change-password', request);
    },
    changeAccountRoleMapping: function(request) {
      return $http.post('/api/admin/account/change-role-mapping', request);
    },
    queryRoles: function(params) {
      return $http.get('/api/admin/roles', {params: params});
    },
    createRole: function(role) {
      return $http.post('/api/admin/role/create', role);
    },
    updateRole: function(role) {
      return $http.post('/api/admin/role/update', role);
    },
    changeRolePrivilegeMapping: function(request) {
      return $http.post('/api/admin/role/change-privilege-mapping', request);
    },
    queryPrivileges: function(params) {
      return $http.get('/api/admin/privileges', {params: params});
    },
    createPrivilege: function(privilege) {
      return $http.post('/api/admin/privilege/create', privilege);
    },
    updatePrivilege: function(privilege) {
      return $http.post('/api/admin/privilege/update', privilege);
    }
  };
});