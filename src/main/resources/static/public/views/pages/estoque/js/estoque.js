app.config(['$stateProvider', '$httpProvider' , '$urlRouterProvider' , function($stateProvider, $httpProvider, $urlRouterProvider) {
	
	$stateProvider
	
	.state('estoque',{
		abstract : true,
		url: '/estoque',
		templateUrl: 'public/views/pages/estoque/estoque.index.html',
		redirecto: 'estoque.listar'
	})
	.state('estoque.cadastrar',{
		url:'/cadastrar',
		templateUrl: 'public/views/pages/estoque/estoque.form.html',
		controller: 'estoqueController as estoqueCtrl'
	})
	.state('estoque.listar',{
		url:'/lista',
		templateUrl: 'public/views/pages/estoque/estoque.list.html',
		controller: 'estoqueController as estoqueCtrl'
	})
	.state('estoque.editar',{
		url:'/:idEstoque/editar',
		templateUrl: 'public/views/pages/estoque/estoque.form.html',
		controller: 'estoqueController as estoqueCtrl'
	})
}]);
