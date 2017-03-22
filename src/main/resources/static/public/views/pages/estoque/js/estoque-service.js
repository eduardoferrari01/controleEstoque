app.factory('estoqueService', function($rootScope, $http, $q) {

	return {
		salvar : function(estoque) {
			console.log(estoque);
			return $http.post('rest/estoque', estoque).then(function(response) {
				return response.data;
			}, function(errResponse) {

			});
		},

		listar : function() {
			return $http.get('rest/estoque').then(function(response) {
				return response.data;
			}, function(errResponse) {

			});
		},

		buscarPorId : function(param) {
			return $http.get('rest/estoque/' + param).then(function(response) {
				return response.data;
			}, function(errResponse) {
				return $q.reject(errResponse);
			});
		},

		alterar : function(estoque) {
			return $http.get('rest/estoque', estoque)
			then(function(response) {
				return response.data;
			}, function(errResponse) {
				return $q.reject(errResponse);
			});
		},

	}
});