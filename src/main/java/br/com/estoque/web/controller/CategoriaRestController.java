package br.com.estoque.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.estoque.domain.Categoria;
import br.com.estoque.service.CategoriaService;


@RestController
@RequestMapping("/rest/categoria")
public class CategoriaRestController {

  @Autowired
  private CategoriaService categoriaServico;

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public void salvar(@RequestBody Categoria categoria) {
    categoriaServico.salvarOuEditar(categoria);

  }

  @ResponseStatus(HttpStatus.CREATED)
  @PutMapping
  public void editar(@RequestBody Categoria categoria) {
    categoriaServico.salvarOuEditar(categoria);

  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping
  public List<Categoria> buscarTodos() {
    return categoriaServico.buscarTodos();
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/{id}")
  public Categoria buscarPorId(@PathVariable Long id) {
    return categoriaServico.buscarPorId(id);
  }

  @DeleteMapping
  public void deletar(Long id) {
    categoriaServico.excluir(id);

  }

}
