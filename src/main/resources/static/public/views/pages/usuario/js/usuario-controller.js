app.controller('usuarioController', function($scope,usuarioService, $stateParams){
	
	var self = this;
		
	
	var idUsuario = $stateParams.idUsuario;
	
	self.submit = submit;
	self.alterar = alterar;
	self.listar = listar;
	self.buscarPorId = buscarPorId;
	
	
	function submit(usuario){
		 
		usuarioService.salvar(self.usuario).
			then(function(t){
				 Materialize.toast('Usuario Salvo', 10000); 
				self.usuario = null;
				}, function(errResponse){
					Materialize.toast(errResponse.data.message , 10000);
			});
	}
	 
	 function alterar(usuario){
		 usuarioService.alterar(self.usuario).
			then(function(t){
				self.usuario = null;
				}, function(errResponse){
			});
	 }
	 
	 
	 function listar(){
		usuarioService.listar().
			then(function(t){
				self.listarUsuarios = t;
				}, function(errResponse){
			});
		};
	function buscarPorId(id){
			if(!id)return;
			usuarioService.buscarPorId(id).
			then(function(p){
				self.usuario = p;
				}, function(errResponse){
		});
		};
		if(idUsuario){
			buscarPorId(idUsuario);
		}
		
});