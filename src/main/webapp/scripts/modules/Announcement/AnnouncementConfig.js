app.config(function ($stateProvider, $urlRouterProvider) {

  $stateProvider
    .state('announcement', {
      url: '/announcement',
      templateUrl: 'views/modules/Announcement/Announcement.html',
      abstract: true
    })
    .state('announcement.records', {
      url: '/records',
      templateUrl: 'views/modules/Announcement/AnnouncementRecordsPage.html',
      controller: 'AnnouncementRecordsPageController'
    })
    .state('announcement.record', {
      url: '/record/:id',
      templateUrl: 'views/modules/Announcement/AnnouncementDetailsPage.html',
      controller: 'AnnouncementDetailsPageController'
    });

  $urlRouterProvider.when('/announcement', '/announcement/records');


});