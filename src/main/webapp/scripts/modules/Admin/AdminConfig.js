app.config(function ($stateProvider) {

  $stateProvider.state('admin', {
    url: '/admin',
    templateUrl: 'views/modules/Admin/Admin.html',
    controller: 'AdminPageController'
  });

});