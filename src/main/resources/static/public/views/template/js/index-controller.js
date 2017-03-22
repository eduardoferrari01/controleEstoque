app.controller('IndexController', ['$rootScope', '$scope', '$mdSidenav', function($rootScope , $scope, $mdSidenav) {
	  $rootScope.toggleSidenav = function(left) {
      $mdSidenav(left).toggle();
    };

   
   
   $('.carousel.carousel-slider').carousel({fullWidth: true});
   
   $(document).ready(function(){  $('.carousel').carousel();   });
   
   $(document).ready(function(){
	      $('.parallax').parallax();
	    });
   
		
}]);
 