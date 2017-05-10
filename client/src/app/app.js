(function() {
   'use strict';

   angular
       .module('plunker', [])
       .config(moduleConfig)
       .run(moduleRun);

         moduleRun.$inject = [];
        function moduleRun() {
            console.log('App started');
        }
})();