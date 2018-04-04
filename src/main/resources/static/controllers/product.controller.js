app.controller('AddProductController',function($scope , $location)
{
    $scope.addproduct = function(){
        console.log('Adding product');
        $scope.loading = true;

    }

});