/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



app.controller('loginCtrl', function ($scope, $state) {

//    $scope.user.role = 'User';
    $scope.signUp = function () {

        alert('registration called');
        $state.go('registration');
    }

    $scope.login = function () {
        alert($scope.user.role);
        console.log($scope.user);

    };

});