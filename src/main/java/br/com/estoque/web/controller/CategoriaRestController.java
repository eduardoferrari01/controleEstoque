package br.com.estoque.web.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.estoque.domain.Categoria;
import br.com.estoque.service.CategoriaService;


@RestController
@RequestMapping("/rest/categoria")
public class CategoriaRestController {

	@Autowired
	private CategoriaService categoriaServico;
	
	@PostMapping
	public ResponseEntity<Categoria> salvar(@RequestBody Categoria categoria,UriComponentsBuilder ucBuilder)
	{
		categoriaServico.salvarOuEditar(categoria);
		return new ResponseEntity<Categoria>(HttpStatus.CREATED);
	}
	@PutMapping
	public ResponseEntity<Categoria> editar(@RequestBody Categoria categoria,UriComponentsBuilder ucBuilder)
	{
		categoriaServico.salvarOuEditar(categoria);
		return new ResponseEntity<Categoria>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<Collection<Categoria>> buscarTodos()
	{
		return new ResponseEntity<Collection<Categoria>>(categoriaServico.buscarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id)
	{
		return new ResponseEntity<Categoria>(categoriaServico.buscarPorId(id),HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Categoria> deletar(Long id)
	{
		categoriaServico.excluir(id);
		return new ResponseEntity<Categoria>(HttpStatus.BAD_REQUEST);
	}

}
