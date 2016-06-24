/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

app.controller('adminProfileCtrl', function ($scope, $state,
        adminProfileService, getEmailService) {
    $scope.myEmail = getEmailService.getEmail();
    alert('email id ' + $scope.myEmail);
    adminProfileService.getAdminProfile().success(function (data) {
        console.log(data.responseData);
        $scope.admin = data.responseData;
    }).error(function (error) {

    });
});

