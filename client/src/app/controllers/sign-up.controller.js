(function() {
    'use strict';

    angular
        .module('movie')
        .controller('AddUserController', AddUserController);

    AddUserController.$inject = ['userService', '$location'];

    function AddUserController(userService, $location) {
        var addUserVm = this;

        addUserVm.addUser = addUser;

        init();

        function init() {
            console.log('AddUserController');
        }

        function addUser() {
            userService
                .createUser(addUserVm.newUser)
                .then(function(data) {
                    $location.path('/#!/sign-in');
                }, function(error) {
                    console.log(error);
                })
        }
    }
})();