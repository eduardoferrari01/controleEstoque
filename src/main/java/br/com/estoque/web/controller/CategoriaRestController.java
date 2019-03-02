package br.com.estoque.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.estoque.domain.Categoria;
import br.com.estoque.service.CategoriaService;
import br.com.estoque.web.controller.api.CategoriaApi;

@RestController
@RequestMapping("/rest/categoria")
public class CategoriaRestController implements CategoriaApi {

  @Autowired
  private CategoriaService categoriaServico;

  public void save(@RequestBody Categoria categoria) {

    categoriaServico.save(categoria);
  }

  public void edit(@RequestBody Categoria categoria) {

    categoriaServico.save(categoria);
  }

  public List<Categoria> findAll() {

    return categoriaServico.findAll();
  }

  public Categoria findById(@PathVariable Long id) {

    return categoriaServico.findById(id);
  }

  public void delete(Long id) {

    categoriaServico.delete(id);
  }

}
