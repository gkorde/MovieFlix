(function() {
    'use strict';

    angular
        .module('movie')
        .controller('SignInController',SignInController)

    SignInController.$inject = ['userService']
    function SignInController(userService)  {
        var signInVm = this;

        init()

        function init() {
            console.log('SignInController');
        }
    }
})();