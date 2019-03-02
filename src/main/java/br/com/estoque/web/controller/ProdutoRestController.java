package br.com.estoque.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.estoque.domain.Produto;
import br.com.estoque.service.ProdutoService;
import br.com.estoque.web.controller.api.ProdutoApi;

@RestController
@RequestMapping("/rest/produto")
public class ProdutoRestController implements ProdutoApi {

  @Autowired
  private ProdutoService produtoService;

  public void save(@RequestBody Produto produto) {

    produtoService.save(produto);
  }

  public void edit(@RequestBody Produto produto) {

    produtoService.save(produto);
  }

  public List<Produto> findAll() {

    return produtoService.findAll();
  }

  public Produto findById(@PathVariable Long id) {

    return produtoService.findById(id);
  }

  public void delete(Long id) {

    produtoService.delete(id);
  }
}
