/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
app.controller('registerCtrl',function ($scope ,$state, registerService){
    $scope.registerUser=function (data){
        
        console.log(data);
         registerService.registerUser(data)
    .success(function (response) {
                console.log(response);
        $state.go("login");
            }).error(function (error) {

        });
    }
   
});

