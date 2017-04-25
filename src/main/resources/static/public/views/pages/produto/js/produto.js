app.config(['$stateProvider', '$httpProvider' , '$urlRouterProvider' , function($stateProvider, $httpProvider, $urlRouterProvider) {
	
	$stateProvider
	
	.state('produto',{
		abstract : true,
		url: '/produto',
		templateUrl:  'public/views/pages/produto/produto.index.html',
		redirecto: 'produto.listar'
	})
	.state('produto.cadastrar',{
		url:'/cadastrar',
		templateUrl: 'public/views/pages/produto/produto.form.html',
		controller: 'produtoController as produtoCtrl'
	})
	.state('produto.listar',{
		url:'/lista',
		templateUrl: 'public/views/pages/produto/produto.list.html',
		controller: 'produtoController as produtoCtrl'
	})
	.state('produto.editar',{
		url:'/:idProduto/editar',
		templateUrl: 'public/views/pages/produto/produto.form.html',
		controller: 'produtoController as produtoCtrl'
	})
}]);
