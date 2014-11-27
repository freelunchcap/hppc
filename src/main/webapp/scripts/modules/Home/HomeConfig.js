app.config(function($urlRouterProvider, $stateProvider) {

  $urlRouterProvider.otherwise('/');

  $stateProvider
    .state('home', {
      url: '/',
      templateUrl: 'views/modules/Home/Home.html',
      controller: 'HomePageController'
    })


});