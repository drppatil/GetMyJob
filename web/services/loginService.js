/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
app.service('loginService', function ($http,$state) {


this.checkLogin = function (data) {
        alert('service called');
        return $http({
            method: 'POST',
            url: '/GetMyJob/api/checklogin',
            data: angular.toJson(data)
        });
    };
});