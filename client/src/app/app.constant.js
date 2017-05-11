(function() {
    'use strict';

    angular
        .module('movie')
        .constant('CONFIG', {
            'API_HOST': 'http://localhost:8080/movieflix_server/api'
        });
})();