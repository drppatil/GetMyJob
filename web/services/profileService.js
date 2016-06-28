app.service('profileService',function ($http){
    this.getProfile = function () {
        return $http({
            method: 'POST',
            url: '/GetMyJob/api/getProfile'
        })
    };
    this.updateProfile=function (profileDetails){
        return $http({
            method:'POST',
            url:'/GetMyJob/api/updateProfile',
            data:angular.toJson(profileDetails),
        })
    }
})

