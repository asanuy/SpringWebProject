var app = angular.module('mainApp');

app.controller('SignUpController', function($scope, $http, $route) {

    $scope.createUser = function() {
        $http.post('/signup', {
            userName : $scope.userName,
            password : $scope.password
        }).then(function(response) {
            alert(response.data.message);
            $route.reload();
        });
    };

});