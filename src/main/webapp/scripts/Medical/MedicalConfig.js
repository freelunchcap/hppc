app.config(function ($routeProvider) {

  $routeProvider.when('/medical', {
    templateUrl: 'views/Medical.html',
    controller: 'MedicalPageController'
  });

});