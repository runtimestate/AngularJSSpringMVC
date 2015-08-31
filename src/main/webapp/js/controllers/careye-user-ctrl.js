careye.controller('UserCtrl', function ($scope, UserService, BaseService) {

    $scope.firstName = '';
    $scope.lastName = '';
    $scope.passw1 = '';
    $scope.passw2 = '';
    BaseService.getAll().then(function (result) {
        $scope.users = result;
    });

    $scope.edit = true;
    $scope.error = false;
    $scope.incomplete = false;
    $scope.editUser = function (id) {
        if (id == 'new') {
            $scope.edit = true;
            $scope.incomplete = true;
            $scope.firstName = '';
            $scope.lastName = '';
        } else {
            BaseService.getById(id).then(function (result) {
                $scope.edit = false;
                $scope.firstName = result.firstName;
                $scope.lastName = result.lastName;
            });
        }
    };

    $scope.$watch('passw1', function () {
        $scope.test();
    });
    $scope.$watch('passw2', function () {
        $scope.test();
    });
    $scope.$watch('firstName', function () {
        $scope.test();
    });
    $scope.$watch('lastName', function () {
        $scope.test();
    });

    $scope.test = function () {
        if ($scope.passw1 !== $scope.passw2) {
            $scope.error = true;
        } else {
            $scope.error = false;
        }
        $scope.incomplete = false;
        if ($scope.edit && (!$scope.firstName.length || !$scope.lastName.length || !$scope.passw1.length || !$scope.passw2.length)) {
            $scope.incomplete = true;
        }
    };
});