app.config(function ($stateProvider) {

  $stateProvider.state('medical', {
    url: '/medical',
    templateUrl: 'views/Medical.html',
    controller: 'MedicalPageController'
  });

});