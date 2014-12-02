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
    })
    .state('medical.record.diagnosis-records', {
      url: '/diagnosis-records',
      templateUrl: 'views/modules/Medical/MedicalRecords/DiagnosisRecordsPage.html',
      controller: 'DiagnosisRecordsPageController'
    })
    .state('medical.record.diagnosis-record', {
      url: '/diagnosis-record/:did',
      data: {
        parents: ['medical.record.diagnosis-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/DiagnosisRecordForm.html',
      controller: 'DiagnosisRecordFormController'
    })
    .state('medical.record.test-records', {
      url: '/test-records',
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecordsPage.html',
      controller: 'TestRecordsPageController'
    })
    .state('medical.record.blood-test-records', {
      url: '/blood-test-records',
      templateUrl: 'views/modules/Medical/MedicalRecords/BloodTestRecordsPage.html',
      controller: 'BloodTestRecordsPageController'
    });

});