/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

app.controller('adminProfileCtrl', function ($scope, $state,
        adminProfileService, getEmailService) {
    $scope.email = getEmailService.getEmail();
    adminProfileService.getAdminProfile($scope.email).success(function (data) {
        $scope.admin = data.responseData;
    }).error(function (error) {

    });
});

