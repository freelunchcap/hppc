app.config(function ($stateProvider) {

  $stateProvider
    .state('medical.record.test-records', {
      url: '/test-records',
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/TestRecordsPage.html',
      controller: 'TestRecordsPageController'
    })
    .state('medical.record.antigen-antibody-test-records', {
      url: '/antigen-antibody-test-records',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/AntigenAntibodyTestRecords/AntigenAntibodyTestRecordsPage.html',
      controller: 'AntigenAntibodyTestRecordsPageController'
    })
    .state('medical.record.antigen-antibody-test-record', {
      url: '/antigen-antibody-test-record/:tid',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/AntigenAntibodyTestRecords/AntigenAntibodyTestRecordForm.html',
      controller: 'AntigenAntibodyTestRecordPageController'
    })
    .state('medical.record.biochemistry-test-records', {
      url: '/biochemistry-test-records',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/BiochemistryTestRecords/BiochemistryTestRecordsPage.html',
      controller: 'BiochemistryTestRecordsPageController'
    })
    .state('medical.record.biochemistry-test-record', {
      url: '/biochemistry-test-record/:tid',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/BiochemistryTestRecords/BiochemistryTestRecordForm.html',
      controller: 'BiochemistryTestRecordPageController'
    })
    .state('medical.record.blood-test-records', {
      url: '/blood-test-records',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/BloodTestRecords/BloodTestRecordsPage.html',
      controller: 'BloodTestRecordsPageController'
    })
    .state('medical.record.blood-test-record', {
      url: '/blood-test-record/:tid',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/BloodTestRecords/BloodTestRecordForm.html',
      controller: 'BloodTestRecordPageController'
    })
    .state('medical.record.feces-test-records', {
      url: '/feces-test-records',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/FecesTestRecords/FecesTestRecordsPage.html',
      controller: 'FecesTestRecordsPageController'
    })
    .state('medical.record.feces-test-record', {
      url: '/feces-test-record/:tid',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/FecesTestRecords/FecesTestRecordForm.html',
      controller: 'FecesTestRecordPageController'
    })
    .state('medical.record.skin-test-records', {
      url: '/skin-test-records',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/SkinTestRecords/SkinTestRecordsPage.html',
      controller: 'SkinTestRecordsPageController'
    })
    .state('medical.record.skin-test-record', {
      url: '/skin-test-record/:tid',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/SkinTestRecords/SkinTestRecordForm.html',
      controller: 'SkinTestRecordPageController'
    })
    .state('medical.record.urine-test-records', {
      url: '/urine-test-records',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/UrineTestRecords/UrineTestRecordsPage.html',
      controller: 'UrineTestRecordsPageController'
    })
    .state('medical.record.urine-test-record', {
      url: '/urine-test-record/:tid',
      data: {
        parents: ['medical.record.test-records']
      },
      templateUrl: 'views/modules/Medical/MedicalRecords/TestRecords/UrineTestRecords/UrineTestRecordForm.html',
      controller: 'UrineTestRecordPageController'
    });

});