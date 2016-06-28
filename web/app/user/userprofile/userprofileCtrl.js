
app.controller('userprofileCtrl', function ($scope, $http, $state, profileService) {
    $scope.profileDetails = [];
    $scope.edit=false;
    
    profileService.getProfile().then(function successCallback(data) {
        $scope.profileDetails = data.data.responseData;
        console.log($scope.profileDetails);
    })
    $scope.editProfile=function (){
        
         $scope.edit = !$scope.edit;
    }
    $scope.update=function (profileDetails){
        
        profileService.updateProfile(profileDetails);
         $scope.edit = !$scope.edit;
         
    }
});
