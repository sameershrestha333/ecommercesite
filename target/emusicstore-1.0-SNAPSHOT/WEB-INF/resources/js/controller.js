// /**
//  * Created by Le on 1/11/2016.
//  */
//
// var cartApp = angular.module ("cartApp", []);
//
// cartApp.controller("cartCtrl", function ($scope, $http){
//
//     $scope.refreshCart = function () {
//         $http.get('/eMusicStore/rest/cart/'+$scope.cartId).success(function (data) {
//             $scope.cart=data;
//         });
//     };
//
//     $scope.clearCart = function () {
//         $http.delete('/eMusicStore/rest/cart/'+$scope.cartId).success($scope.refreshCart());
//     };
//
//     $scope.initCartId = function (cartId) {
//         $scope.cartId = cartId;
//         $scope.refreshCart(cartId);
//     };
//
//     $scope.addToCart = function (productId) {
//         $http.put('/eMusicStore/rest/cart/add/'+productId).success(function () {
//             alert("Product successfully added to the cart!")
//         });
//     };
//
//     $scope.removeFromCart = function (productId) {
//         $http.put('/eMusicStore/rest/cart/remove/'+productId).success(function (data) {
//             $scope.refreshCart();
//         });
//     };
//
//     $scope.calGrandTotal = function () {
//         var grandTotal=0;
//
//         for (var i=0; i<$scope.cart.cartItemList.length; i++) {
//             grandTotal+=$scope.cart.cartItemList[i].totalPrice;
//         }
//
//         return grandTotal;
//     };
// });


//files



//defining angular module

var cartApp = angular.module("cartApp", []);

//method
cartApp.controller("cartCtrl", function ($scope, $http) {
    //1. function to refresh the cart
    $scope.refreshCart = function () {
        //now we will use service to consume the rest
        $http.get("/eMusicStore/rest/cart/" + $scope.cartId).success(function (data) {//if it success
            $scope.cart = data;
        });
    };


    //2. function to clearCart
    $scope.clearCart = function () {
        $http.delete("/eMusicStore/rest/cart/" + $scope.cartId).success($scope.refreshCart())
    };



    //3. function to initialize the cart
    $scope.initCartId = function (cartId) {
        $scope.cartId = cartId;
        //$scope.refreshCart(cartId);
        $scope.refreshCart();

    };

    //4. function to add cart
    $scope.addToCart = function (productId) {
        $http.put("/eMusicStore/rest/cart/add/" + productId).success(function () {
           //  $scope.refreshCart();
            alert("Product Successfully added to the cart.");
        })
    };

    //5, function to remove cart
    $scope.removeFromCart=function (productId) {
        $http.put("/eMusicStore/rest/cart/remove/"+productId).success(function (data) {
            $scope.refreshCart();
        })
    };

    //to calculate grandTotal
    $scope.calGrandTotal=function () {
        var grandTotal=0;
        for(var i=0;i<$scope.cart.cartItemList.length;i++){
            grandTotal+=$scope.cart.cartItemList[i].totalPrice;
        }
        return grandTotal;
    };


});
