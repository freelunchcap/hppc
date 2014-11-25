app.config(function ($stateProvider) {

  $stateProvider.state('announcement', {
    url: '/announcement',
    templateUrl: 'views/modules/Announcement/Announcement.html',
    controller: 'AnnouncementPageController'
  });

});