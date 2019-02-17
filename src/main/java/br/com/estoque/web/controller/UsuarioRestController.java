package br.com.estoque.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.estoque.domain.Usuario;
import br.com.estoque.service.UsuarioService;

@RestController
@RequestMapping("/rest/usuario")
public class UsuarioRestController {

  @Autowired
  private UsuarioService usuarioService;

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public void salvar(@RequestBody Usuario usuario) {
    usuarioService.salvarOuEditar(usuario);

  }

  @ResponseStatus(HttpStatus.CREATED)
  @PutMapping
  public void editar(@RequestBody Usuario usuario) {
    usuarioService.salvarOuEditar(usuario);

  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping
  public List<Usuario> buscarTodos() {
    return usuarioService.buscarTodos();
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("{id}")
  public Usuario buscarPorId(Long id) {
    return usuarioService.buscarPorId(id);
  }

  @DeleteMapping
  public void excluir(Long id) {
    usuarioService.excluir(id);

  }

}
