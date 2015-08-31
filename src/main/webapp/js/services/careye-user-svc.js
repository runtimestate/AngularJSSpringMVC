careye.service('UserService', function ($http, $q, $log) {

    function getByFirstName(firstName) {
        var deferred = $q.defer();
        $http.get(_contextPath + '/account/user/').success(function (data) {
            deferred.resolve(data);
        }).error(function (msg, code) {
            deferred.reject(msg);
            $log.error(msg, code);
        });
        return deferred.promise;
    }

    return {
        getByFirstName: getByFirstName
    }
});