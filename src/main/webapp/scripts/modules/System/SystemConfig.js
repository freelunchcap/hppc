app.config(function ($stateProvider) {

  $stateProvider
    .state('system', {
      url: '/system',
      abstract: true,
      templateUrl: 'views/modules/System/System.html',
      controller: 'SystemPageController'
    })
    .state('system.accounts', {
      url: '/accounts',
      templateUrl: 'views/modules/System/Accounts/AccountsPage.html',
      controller: 'AccountsPageController'
    })
    .state('system.account', {
      url: '/account/:id',
      templateUrl: 'views/modules/System/Accounts/AccountDetailsPage.html',
      controller: 'AccountDetailsPageController'
    })
    .state('system.roles', {
      url: '/roles',
      templateUrl: 'views/modules/System/Roles/RolesPage.html',
      controller: 'RolesPageController'
    })
    .state('system.roles', {
      url: '/role/:id',
      templateUrl: 'views/modules/System/Roles/RoleDetailsPage.html',
      controller: 'RoleDetailsPageController'
    })
    .state('system.privileges', {
      url: '/privileges',
      templateUrl: 'views/modules/System/Privileges/PrivilegesPage.html',
      controller: 'PrivilegesPageController'
    })
    .state('system.privilege', {
      url: '/privilege/:id',
      templateUrl: 'views/modules/System/Privileges/PrivilegeDetailsPage.html',
      controller: 'PrivilegeDetailsPageController'
    });

});