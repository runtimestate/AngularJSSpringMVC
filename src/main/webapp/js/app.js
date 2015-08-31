var careye = angular.module('careye', ['ui.router'])

    .config(function ($stateProvider, $urlRouterProvider) {

        $stateProvider

            .state('users', {
                url: '/users',
                templateUrl: 'templates/users.html',
                controller: 'UserCtrl'
            });

        // if none of the above states are matched, use this as the fallback
        $urlRouterProvider.otherwise('/users');
    });