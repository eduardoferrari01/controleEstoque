app.config(['$stateProvider', '$httpProvider' , '$urlRouterProvider' , function($stateProvider, $httpProvider, $urlRouterProvider) {
	
	$stateProvider
	
	.state('produto',{
		url: '/produto',
		templateUrl:  '',
		controller: 'produtoController'
	})
	.state('produtoCadastrar',{
		url:'/cadastrarProduto',
		templateUrl: 'public/views/pages/produto/produto.form.html',
		controller: 'produtoController as produtoCtrl'
	})
	.state('produtoListar',{
		url:'/lista',
		templateUrl: 'public/views/pages/produto/produto.list.html',
		controller: 'produtoController as produtoCtrl'
	})
	.state('produtoEditar',{
		url:'/idProduto/editar',
		templateUrl: 'public/views/pages/produto/produto.form.html',
		controller: 'produtoController as produtoCtrl'
	})
}]);
