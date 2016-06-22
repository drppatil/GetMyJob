/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

app.service('registerService',function ($http){
    
    this.registerUser=function (data){
        console.log("service"+data);
         return $http({
            method:'POST',
            url:'/GetMyJob/api/addUser',
            headers: {'Content-Type': 'application/json'},
            data:angular.toJson(data)
        });
    }
})
