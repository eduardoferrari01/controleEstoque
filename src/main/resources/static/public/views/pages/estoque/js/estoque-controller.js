app.controller('estoqueController', function($scope, estoqueService,
		$stateParams) {

	var self = this;
	var idEstoque = $stateParams.idEstoque;

	self.submit = submit;
	self.alterar = alterar;
	self.listar = listar;
	self.buscarPorId = buscarPorId;

	function submit(estoque) {

		estoqueService.salvar(self.estoque).then(function(t) {
			Materialize.toast('Estoque Salvo!', 10000);
			self.estoque = null;
		}, function(errResponse) {

			Materialize.toast(errResponse.data.message, 10000);
		});
	}

	function alterar(estoque) {

		estoqueService.alterar(self.estoque).then(function(t) {
			self.estoque = null;
		}, function(errResponse) {

		});
	}

	function listar() {

		estoqueService.listar().then(function(t) {
			self.listarEstoques = t;
		}, function(errResponse) {

		});
	}

	function buscarPorId(id) {
		if (!id)
			return;
		estoqueService.buscarPorId(id).then(function(p) {
			self.estoque = p;
		}, function(errResponse) {

		});

	}

	if (idEstoque) {
		buscarPorId(idEstoque);
	}

});