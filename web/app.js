/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var app = angular.module('myJob', ['ui.router']);
//
app.controller('myJobController', ['$scope', function ($scope) {

        $scope.clicked = function () {

            $("#wrapper").toggleClass("toggled");

        }

    }]);


app.config(function ($stateProvider) {
    $stateProvider
            .state('login', {
                url: '/login',
                views: {
                    content: {
                        templateUrl: 'app/login/login.html',
                        controller: 'loginCtrl'
                    }
                }
            })
            .state('registration', {
                url: '/registration',
                views: {
                    content: {
                        templateUrl: 'app/register/registration.html',
                        controller: 'registerCtrl'
                    }
                }
            })
            .state('admin', {
                url: '/admin',
                views: {
                    header: {templateUrl: "app/header/header.html"},
                    sidebar: {templateUrl: "app/sidebar/sidebar.html"},
                    content: {templateUrl: "app/admin/admin.html"},
                    'inner@admin': {
                        templateUrl: 'app/admin/adminprofile/adminprofile.html',
                        controller: 'adminProfileCtrl'

                    },
                }
            })
            .state('admin.adminprofile', {
                url: '/adminprofile',
                templateUrl: 'app/admin/adminprofile/adminprofile.html',
                controller: 'adminProfileCtrl'
            })
            .state('admin.postjob', {
                url: '/postjob',
                templateUrl: 'app/admin/postjob/postjob.html',
            })
            .state('admin.viewusers', {
                url: '/viewusers',
                templateUrl: 'app/admin/viewusers/viewusers.html',
            })
}).run(function ($state) {
    $state.go('admin');

});