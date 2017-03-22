package br.com.estoque.web.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estoque.domain.Produto;
import br.com.estoque.service.ProdutoService;

@RestController
@RequestMapping("/rest/produto")
public class ProdutoRestController {

	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping
	public ResponseEntity<Produto> salvar(@RequestBody Produto produto)
	{
		produtoService.salvarOuEditar(produto);
		return new ResponseEntity<Produto>(HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Produto> editar(@RequestBody Produto produto)
	{
		produtoService.salvarOuEditar(produto);
		return new ResponseEntity<Produto>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<Collection<Produto>> buscarTodos()
	{
		return new ResponseEntity<Collection<Produto>>(produtoService.buscarTodos(),HttpStatus.OK);
	}
	@GetMapping("{id}")
	public ResponseEntity<Produto> buscarPorId(Long id)
	{
		return new ResponseEntity<Produto>(produtoService.buscarPorId(id),HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Produto> deletar(Long id)
	{
		produtoService.excluir(id);
		return new ResponseEntity<Produto>(HttpStatus.BAD_REQUEST);
	}
}
