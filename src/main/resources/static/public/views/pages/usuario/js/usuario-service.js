app.factory('usuarioService', function($rootScope, $http,$q){
	
	
	return{
		salvar: function(usuario){
			
			return $http.post('rest/usuario',usuario)
			.then(function(response){
			return response.data;
			},function(errResponse){
				});
		},
		listar: function(){
			
			return $http.get('rest/usuario')
			.then(function(response){
				return response.data;
			},function(errResponse){
				});
		},
		buscarPorId: function(param){
			return $http.get('rest/usuario/'+param)
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
			});
		},
		
		alterar: function(usuario){
			return $http.put('rest/usuario', usuario)
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
			});
		},
		
	}
});