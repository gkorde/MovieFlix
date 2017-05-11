(function () {
    'use strict';

    angular
        .module('movie', ['ngRoute'])
        .config(moduleConfig);

    function moduleConfig($routeProvider) {

        $routeProvider
            .when('/', {
                templateUrl: 'app/views/home.tmpl.html'
            })
            .when('/sign-in', {
                templateUrl: 'app/views/sign-in.tmpl.html',
                controller: 'SignInController',
                controllerAs: 'loginVm'
            })
            .when('/sign-up', {
                templateUrl: 'app/views/sign-up.tmpl.html',
                controller: 'AddUserController',
                controllerAs: 'AddUserVm'
            })
            .when('/titles', {
                templateUrl: 'app/views/titles.tmpl.html',
                controller: 'TitlesController',
                controllerAs: 'titlesVm'
            })
            .otherwise({
                redirectTo: ''
            });
    }
})();