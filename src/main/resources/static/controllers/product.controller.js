
app.controller('EditProductsController',
    function ($window,
              $scope,
              $location,
              ListProductsByIdFactory,
              EditProductService,
              $route,
              $routeParams) {
        var selectedProduct = ListProductsByIdFactory.query({id: $routeParams.id});
        selectedProduct.$promise.then(function (result, productId) {
            $scope.EditProductsController = $scope.editProductCtrl || {};
            $scope.EditProductsController.productName = result.productName;
            $scope.EditProductsController.price = result.price;
            $scope.EditProductsController.description = result.description;
            $scope.EditProductsController.category = result.category;
            $scope.EditProductsController.productStatus = result.productStatus;
        });

        $scope.edit = function () {
            console.log('Edit product called');
            $scope.loading = true;
            EditProductService.editProduct($scope, $location,
                $scope.EditProductsController.productName,
                $scope.EditProductsController.price,
                $scope.EditProductsController.description,
                $scope.EditProductsController.category,
                $routeParams.id,
                $scope.EditProductsController.productStatus,
                function (result, productId) {
                    if (result === true) {
                        $window.location.href = '/#/productview/' + productId;
                    } else {
                        $scope.error = 'Edit product failed';
                        $scope.loading = false;
                    }
                });
        };


    });