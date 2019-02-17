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
import br.com.estoque.domain.Produto;
import br.com.estoque.service.ProdutoService;

@RestController
@RequestMapping("/rest/produto")
public class ProdutoRestController {

  @Autowired
  private ProdutoService produtoService;

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public void salvar(@RequestBody Produto produto) {
    produtoService.salvarOuEditar(produto);

  }

  @ResponseStatus(HttpStatus.CREATED)
  @PutMapping
  public void editar(@RequestBody Produto produto) {
    produtoService.salvarOuEditar(produto);

  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping
  public List<Produto> buscarTodos() {
    return produtoService.buscarTodos();
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/{id}")
  public Produto buscarPorId(@PathVariable Long id) {
    return produtoService.buscarPorId(id);
  }

  @DeleteMapping
  public void deletar(Long id) {
    produtoService.excluir(id);

  }
}
