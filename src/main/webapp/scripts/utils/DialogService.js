app.service('DialogService', function($modal) {
  return {
    confirm: function(title, content) {
      return $modal.open({
        templateUrl: 'views/utils/ConfirmDialog.html',
        controller: function($scope, $modalInstance) {
          $scope.title = title;
          $scope.content = content;
          $scope.confirm = function () {
            $modalInstance.close();
          };
          $scope.cancel = function () {
            $modalInstance.dismiss();
          };
        }
      });
    }
  }
});