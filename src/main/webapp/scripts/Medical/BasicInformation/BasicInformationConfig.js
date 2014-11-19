app.config(function ($stateProvider) {

  $stateProvider
    .state('medical.basic-information', {
      url: '/basic-information',
      templateUrl: 'views/BasicInformationPage.html',
      controller: 'BasicInformationPageController'
    })
    .state('medical.basic-information-create', {
      url: '/basic-information/create',
      templateUrl: 'views/BasicInformationForm.html',
      controller: 'BasicInformationFormController'
    })
    .state('medical.basic-information-edit', {
      url: '/basic-information/edit/:id',
      templateUrl: 'views/BasicInformationForm.html',
      controller: 'BasicInformationFormController'
    });

});