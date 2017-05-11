(function() {
    'use strict';

    angular.module('movie')
        .service('titleService', titleService);

    titleService.$inject = ['$http', '$q', 'CONFIG'];

    function titleService($http, $q, CONFIG) {

        var self = this;

        self.getTitles = getTitles;
        self.getTitleById = getTitleById;

        function getTitles() {
            console.log('titleService');
            return $http.get(CONFIG.API_HOST + '/movies')
                .then(successFn, errorFn);
        }

        function getTitleById(id) {
            return $http.get(CONFIG.API_HOST + '/movies/' + id)
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