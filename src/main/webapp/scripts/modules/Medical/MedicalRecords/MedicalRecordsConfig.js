app.config(function ($stateProvider) {

  $stateProvider
    .state('medical.records', {
      url: '/records',
      templateUrl: 'views/modules/Medical/MedicalRecords/MedicalRecordsPage.html',
      controller: 'MedicalRecordsPageController'
    })
    .state('medical.create-record', {
      url: '/record/create',
      templateUrl: 'views/modules/Medical/MedicalRecords/MedicalRecordDetailsPage.html',
      controller: 'MedicalRecordDetailsPageController'
    })
    .state('medical.edit-record', {
      url: '/record/edit/:id',
      templateUrl: 'views/modules/Medical/MedicalRecords/MedicalRecordDetailsPage.html',
      controller: 'MedicalRecordDetailsPageController'
    });

});