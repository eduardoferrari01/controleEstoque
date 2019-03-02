package br.com.estoque.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.estoque.domain.Estoque;
import br.com.estoque.service.EstoqueService;
import br.com.estoque.web.controller.api.EstoqueApi;

@RestController
@RequestMapping("/rest/estoque")
public class EstoqueRestController implements EstoqueApi {

  @Autowired
  private EstoqueService estoqueService;

  public void save(@RequestBody Estoque estoque) {

    estoqueService.save(estoque);
  }

  public void edit(@RequestBody Estoque estoque) {

    estoqueService.save(estoque);
  }

  public List<Estoque> findAll() {

    return estoqueService.findAll();
  }

  public Estoque findById(@PathVariable Long id) {

    return estoqueService.findById(id);
  }

  public void delete(Long id) {

    estoqueService.delete(id);
  }
}
