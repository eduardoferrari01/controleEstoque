app.config(['$stateProvider', '$httpProvider' , '$urlRouterProvider' , function($stateProvider, $httpProvider, $urlRouterProvider) {
	
	$stateProvider
	
	.state('usuario',{
		url: '/usuario',
		templateUrl:  '',
		controller: 'usuarioController'
	})
	.state('usuarioCadastrar',{
		url:'/cadastrar',
		templateUrl: 'public/views/pages/usuario/usuario.form.html',
		controller: 'usuarioController as usuarioCtrl'
	})
	.state('usuarioListar',{
		url:'/lista',
		templateUrl: 'public/views/pages/usuario/usuario.list.html',
		controller: 'usuarioController as usuarioCtrl'
	})
	.state('usuarioEditar',{
		url:'/idUsuario/editar',
		templateUrl: 'public/views/pages/usuario/usuario.form.html',
		controller: 'usuarioController as usuarioCtrl'
	})
}]);