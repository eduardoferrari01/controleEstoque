app.factory('produtoService', function($rootScope, $http, $q) {

	return {
		salvar : function(produto) {
			console.log(produto);
			return $http.post('rest/produto',produto).then(function(response) {
				return response.data;
			}, function(errResponse) {

			});
		},

		listar : function() {
			return $http.get('rest/produto').then(function(response) {
				return response.data;
			}, function(errResponse) {

			});
		},

		buscarPorId : function(param) {
			return $http.get('rest/produto/' + param).then(function(response) {
				return response.data;
			}, function(errResponse) {
				return $q.reject(errResponse);
			});
		},

		alterar : function(produto) {
			return $http.get('rest/produto', produto)
			then(function(response) {
				return response.data;
			}, function(errResponse) {
				return $q.reject(errResponse);
			});
		},

	}
});