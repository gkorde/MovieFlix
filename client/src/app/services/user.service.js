(function() {
    'use strict';

    angular.module('movie')
        .service('userService', userService);

    userService.$inject = ['$http', '$q', 'CONFIG'];

    function userService($http, $q, CONFIG) {

        var self = this;

        self.addUsers = addUsers;

        function addUsers(user) {
            return $http.post(CONFIG.API_HOST + '/users', user)
                .then(successFn, errorFn);
        }

        function successFn(response) {
            return response.data;
        }

        function errorFn(response) {
            return $q.reject('ERROR: ' + response.statusText);
        }
    }

})();