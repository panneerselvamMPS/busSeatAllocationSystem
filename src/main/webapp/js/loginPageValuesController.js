"use strict"
var myApp = angular.module('myApp');
myApp.controller('loginPageValuesController',loginPageValuesController);

function  loginPageValuesController($scope,$http){
$scope.loginPageValues={};
$scope.available=false;

$scope.custsubmit=function()
{
	console.log($scope.loginPageValues.userName)
	console.log($scope.loginPageValues.password)
	  if(($scope.loginPageValues.userName==null||$scope.loginPageValues.userName=="")||($scope.loginPageValues.password==null||$scope.loginPageValues.password==""))
	  {
	  $scope.alert("Please Fill in all the details");
	  return;
	  }
      $http({
	    method : "POST",
	      url : "validatelogin",
	      data: $scope.loginPageValues
	  }).then(function mySuccess(response) { 
	  $scope.resplis=response.data;
	  if($scope.resplis.status == 'Success'){
		var globalVariable={
			x: $scope.resplis.userType
		 };
		$scope.alert($scope.resplis.message);
		window.location='index';
	  }
	  else{
		$scope.alert($scope.resplis.message);
	  }
	  }, function myError(response) {
	  $scope.alert("Something went wrong.Please try Again Later");
	  });
}

$scope.custreset=function()
{
$scope.loginPageValues={};
$scope.available=false;
}
$scope.alert=function(val)
{
$scope.alertmessage=val;
document.getElementById("id1").click();
}
}