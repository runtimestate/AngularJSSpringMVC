careye.service('BaseService', function ($http, $q, $log) {

    function getAll() {
        var deferred = $q.defer();
        $http.get(_contextPath + '/base/entity/').success(function (data) {
            deferred.resolve(data);
        }).error(function (msg, code) {
            deferred.reject(msg);
            $log.error(msg, code);
        });
        return deferred.promise;
    }

    function getById(id) {
        var deferred = $q.defer();
        $http.get(_contextPath + '/base/entity/' + id).success(function (data) {
            deferred.resolve(data);
        }).error(function (msg, code) {
            deferred.reject(msg);
            $log.error(msg, code);
        });
        return deferred.promise;
    }

    return {
        getAll: getAll,
        getById: getById
    }
});