app.controller('produtoController', function($scope, produtoService,
		$stateParams) {

	var self = this;
	var idProduto = $stateParams.idProduto;

	self.submit = submit;
	self.alterar = alterar;
	self.listar = listar;
	self.buscarPorId = buscarPorId;

	function submit(produto) {

		produtoService.salvar(self.produto).then(function(t) {
			Materialize.toast('Produto Salvo!', 10000);
			self.produto = null;
		}, function(errResponse) {

			Materialize.toast(errResponse.data.message, 10000);
		});
	}

	function alterar(produto) {

		produtoService.alterar(self.produto).then(function(t) {
			self.produto = null;
		}, function(errResponse) {

		});
	}

	function listar() {

		produtoService.listar().then(function(t) {
			self.listarProdutos = t;
		}, function(errResponse) {

		});
	}

	function buscarPorId(id) {
		if (!id)
			return;
		produtoService.buscarPorId(id).then(function(p) {
			self.produto = p;
		}, function(errResponse) {

		});

	}

	if (idProduto) {
		buscarPorId(idProduto);
	}

});