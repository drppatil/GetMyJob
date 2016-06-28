/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

app.service('adminProfileService', function ($http) {

    this.getAdminProfile = function (data) {
        return  $http({
            method: 'POST',
            url: 'api/getadminprofile',
            data:{
                email:data
            }
        })
    };
});
