app.config(function ($stateProvider) {

  $stateProvider.state('medical', {
    url: '/medical',
    templateUrl: 'views/modules/Medical/Medical.html',
    controller: 'MedicalPageController'
  });

});