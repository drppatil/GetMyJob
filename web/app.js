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
                        controller:'loginCtrl'
                    }
                }
            })
            .state('registration', {
                url: '/registration',
                views: {
                    content: {
                        templateUrl: 'app/registration/registration.html'
                    }
                }
            })
            .state('dashboard', {
                url: '/dashboard',
                views: {
                    header: {templateUrl: "app/header/header.html"},
                    sidebar: {templateUrl: "app/sidebar/sidebar.html"},
                    content: {templateUrl: "dashboard.html"}
                }
            })
            .state('events', {
                url: '/events',
                views: {
                    header: {templateUrl: "app/header/header.html"},
                    sidebar: {templateUrl: "app/sidebar/sidebar.html"},
                    content: {templateUrl: "events.html"}
                }
            })
            .state('about', {
                url: '/about',
                views: {
                    header: {templateUrl: "app/header/header.html"},
                    sidebar: {templateUrl: "app/sidebar/sidebar.html"},
                    content: {templateUrl: "about.html"}
                }
            })
            .state('services', {
                url: '/services',
                views: {
                    header: {templateUrl: "app/header/header.html"},
                    sidebar: {templateUrl: "app/sidebar/sidebar.html"},
                    content: {templateUrl: "services.html"}
                }
            })
            .state('contact', {
                url: 'contact',
                views: {
                    header: {templateUrl: "app/header/header.html"},
                    sidebar: {templateUrl: "app/sidebar/sidebar.html"},
                    content: {templateUrl: "contact.html"}
                }
            })

}).run(function ($state) {
    $state.go('login');
  
});