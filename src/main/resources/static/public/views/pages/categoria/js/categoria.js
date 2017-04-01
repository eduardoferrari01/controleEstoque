app.config(['$stateProvider', '$httpProvider' , '$urlRouterProvider' , function($stateProvider, $httpProvider, $urlRouterProvider) {
	
	$stateProvider
	
	.state('categoria', {
		abstract : true,
		url: '/categoria',
	      templateUrl: 'public/views/pages/categoria/categoria.index.html',
	      redirecto: 'categoria.listar'
	    })
	    
	     .state('categoria.cadastrar', {
	      url: '/cadastrar',
	      templateUrl: 'public/views/pages/categoria/categoria.form.html',
	      controller: 'categoriaController as categoriaCtrl'
	    })
	    
	     .state('categoria.listar', {
	      url: '/lista',
	      templateUrl: 'public/views/pages/categoria/categoria.list.html',
	      controller: 'categoriaController as categoriaCtrl'
	    })
	    
	    .state('categoria.editar', {
	      url: '/:idCategoria/editar',
	      templateUrl: 'public/views/pages/categoria/categoria.form.html',
	      controller: 'categoriaController as categoriaCtrl'
	})
}]);