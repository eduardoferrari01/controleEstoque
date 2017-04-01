app.config(['$stateProvider', '$httpProvider' , '$urlRouterProvider' , function($stateProvider, $httpProvider, $urlRouterProvider) {
	
	$stateProvider
	
	.state('usuario',{
		abstract : true,
		url: '/usuario',
		templateUrl:  '',
		redirecto: 'usuario.listar'
	})
	.state('usuario.cadastrar',{
		url:'/cadastrar',
		templateUrl: 'public/views/pages/usuario/usuario.form.html',
		controller: 'usuarioController as usuarioCtrl'
	})
	.state('usuario.listar',{
		url:'/lista',
		templateUrl: 'public/views/pages/usuario/usuario.list.html',
		controller: 'usuarioController as usuarioCtrl'
	})
	.state('usuario.editar',{
		url:'/idUsuario/editar',
		templateUrl: 'public/views/pages/usuario/usuario.form.html',
		controller: 'usuarioController as usuarioCtrl'
	})
}]);