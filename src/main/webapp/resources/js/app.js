var app = angular.module('mainApp', ['ngRoute']);

app.config(function($routeProvider) {

    $routeProvider
        .when('/signup', {
            templateUrl: 'static/sign-up.html',
            controller: 'SignUpController'
        })
        .otherwise({redirectTo: '/signup'});
});