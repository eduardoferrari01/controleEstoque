app.config(['$stateProvider', '$httpProvider' , '$urlRouterProvider' , function($stateProvider, $httpProvider, $urlRouterProvider) {
	
	$stateProvider
	
	.state('estoque',{
		url: '/estoque',
		templateUrl:  '',
		controller: 'estoqueController'
	})
	.state('estoqueCadastrar',{
		url:'/cadastrarEstoque',
		templateUrl: 'public/views/pages/estoque/estoque.form.html',
		controller: 'estoqueController as estoqueCtrl'
	})
	.state('estoqueListar',{
		url:'/lista',
		templateUrl: 'public/views/pages/estoque/estoque.list.html',
		controller: 'estoqueController as estoqueCtrl'
	})
	.state('estoqueEditar',{
		url:'/idEstoque/editar',
		templateUrl: 'public/views/pages/estoque/estoque.form.html',
		controller: 'estoqueController as estoqueCtrl'
	})
}]);
