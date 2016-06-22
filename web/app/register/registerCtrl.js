/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
app.controller('registerCtrl',function ($scope , registerService){
    $scope.registerUser=function (data){
        
        console.log(data);
         registerService.registerUser(data)
    .success(function (response) {
                console.log(response);
            }).error(function (error) {

        });
    }
   
});

