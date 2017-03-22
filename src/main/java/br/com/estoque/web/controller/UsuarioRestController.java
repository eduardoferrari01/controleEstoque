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

import br.com.estoque.domain.Usuario;
import br.com.estoque.service.UsuarioService;

@RestController
@RequestMapping("/rest/usuario")
public class UsuarioRestController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario)
	{
		usuarioService.salvarOuEditar(usuario);
		return new ResponseEntity<Usuario>(HttpStatus.CREATED);
	}
	@PutMapping
	public ResponseEntity<Usuario> editar(@RequestBody Usuario usuario)
	{
		usuarioService.salvarOuEditar(usuario);
		return new ResponseEntity<Usuario>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<Collection<Usuario>> buscarTodos()
 	{
   	    return new ResponseEntity<Collection<Usuario>>(usuarioService.buscarTodos(),HttpStatus.OK);
    }
	
	@GetMapping("{id}")
	public ResponseEntity<Usuario> buscarPorId(Long id)
	{
		return new ResponseEntity<Usuario>(usuarioService.buscarPorId(id),HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Usuario> excluir(Long id)
	{
		 usuarioService.excluir(id);
		 return new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
	}
	
}
