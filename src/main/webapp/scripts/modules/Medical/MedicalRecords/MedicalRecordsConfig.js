app.config(function ($stateProvider) {

  $stateProvider
    .state('medical.records', {
      url: '/records',
      templateUrl: 'views/modules/Medical/MedicalRecords/MedicalRecordsPage.html',
      controller: 'MedicalRecordsPageController'
    })
    .state('medical.record', {
      url: '/record/:id',
      abstract: true,
      templateUrl: 'views/modules/Medical/MedicalRecords/MedicalRecordDetailsPage.html',
      controller: 'MedicalRecordDetailsPageController'
    })
    .state('medical.record.basic-information', {
      url: '/basic-information',
      templateUrl: 'views/modules/Medical/MedicalRecords/BasicInformationForm.html',
      controller: 'BasicInformationFormController'
    });

});