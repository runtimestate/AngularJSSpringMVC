<!DOCTYPE html>
<html>
<head>
    <script>
        var _contextPath = "${pageContext.request.contextPath}";
    </script>

    <link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
    <script src="lib/angular/angular.min.js"></script>
    <script src="lib/angular-ui-router/angular-ui-router.js"></script>

    <!-- careye app's js -->
    <script src="js/app.js"></script>
    <!-- careye controller's js -->
    <script src="js/controllers/careye-user-ctrl.js"></script>
    <!-- careye service's js -->
    <script src="js/services/careye-svc.js"></script>
    <script src="js/services/careye-user-svc.js"></script>
</head>
<body ng-app="careye">
<div ui-view></div>
</body>
</html>