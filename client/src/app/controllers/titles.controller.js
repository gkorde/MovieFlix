(function() {
    'use strict';

    angular.module('movie')
        .controller('TitlesController', TitlesController);

    TitlesController.$inject = ['titleService'];

    function TitlesController(titleService) {
        var titlesVm = this;

        init();

        function init() {
            console.log('TitlesController');

            titlesVm.sorter = {
                sortBy: 'title',
                sortOrder: false
            };

            titleService
                .getTitles()
                .then(function(titles) {
                    console.log('return titles successful');
                    titlesVm.titles = titles;
                }, function(error) {
                    console.log(error);
                });
        }

    }

})();

