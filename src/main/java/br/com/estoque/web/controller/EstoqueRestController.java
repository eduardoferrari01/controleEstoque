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
import org.springframework.web.util.UriComponentsBuilder;

import br.com.estoque.domain.Estoque;
import br.com.estoque.service.EstoqueService;

@RestController
@RequestMapping("/rest/estoque")
public class EstoqueRestController {

	@Autowired
	private EstoqueService estoqueService;
	
	@PostMapping
	public ResponseEntity<Estoque> salvar(@RequestBody Estoque estoque,UriComponentsBuilder ucBuilder)
	{
		
		estoqueService.salvarOuEditar(estoque);
		return new ResponseEntity<Estoque>(HttpStatus.CREATED);
	}
	@PutMapping
	public ResponseEntity<Estoque> editar(@RequestBody Estoque estoque,UriComponentsBuilder ucBuilder)
	{
		estoqueService.salvarOuEditar(estoque);
		return new ResponseEntity<Estoque>(HttpStatus.CREATED);
	}
	@GetMapping
	public ResponseEntity<Collection<Estoque>> buscarTodos(){
	
		return new ResponseEntity<Collection<Estoque>>(estoqueService.buscarTodos(),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Estoque> buscarPorId(Long id)
	{
		return new ResponseEntity<Estoque>(estoqueService.buscarPorId(id),HttpStatus.OK);
	}
	@DeleteMapping
	public ResponseEntity<Estoque> deletar(Long id)
	{
		estoqueService.excluir(id);
		return new ResponseEntity<Estoque>(HttpStatus.BAD_REQUEST);
	}
}
