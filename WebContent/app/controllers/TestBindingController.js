
sportsStoreModule
.controller("testbindingCtrl",	function($scope  ) {
	
	
	$scope.s1 = 'Apurv'
	$scope.s2 = 'Mathur'
	$scope.s3 = 'kgp'
	
	$scope.combinedStr = function(){
		alert('calling')
		return $scope.s1+' '+$scope.s2+' '+$scope.s3+' '+$scope.s4
	}
	
	$scope.combinedStr2 = function(){
		alert('calling2')
		return $scope.s1+' '+$scope.s2+' '+$scope.s3
	}
		
	
});