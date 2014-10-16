
sportsStoreModule.controller("testfilterCtrl",	function($scope , $filter  ) {

	$scope.v1 = 'ApUrV'
	$scope.v2 = $filter('lowercase')($scope.v1)
		
	 
		
	
});