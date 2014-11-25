app.config(function ($stateProvider) {

  $stateProvider.state('system', {
    url: '/system',
    templateUrl: 'views/modules/System/System.html',
    controller: 'SystemPageController'
  });

});