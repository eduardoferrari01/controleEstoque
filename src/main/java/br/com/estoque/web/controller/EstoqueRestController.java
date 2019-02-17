package br.com.estoque.web.controller;

import java.util.List;
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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import br.com.estoque.domain.Estoque;
import br.com.estoque.service.EstoqueService;

@RestController
@RequestMapping("/rest/estoque")
public class EstoqueRestController {

  @Autowired
  private EstoqueService estoqueService;

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public ResponseEntity<Estoque> salvar(@RequestBody Estoque estoque,
      UriComponentsBuilder ucBuilder) {

    estoqueService.salvarOuEditar(estoque);
    return new ResponseEntity<Estoque>(HttpStatus.CREATED);
  }

  @ResponseStatus(HttpStatus.CREATED)
  @PutMapping
  public void editar(@RequestBody Estoque estoque) {
    estoqueService.salvarOuEditar(estoque);

  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping
  public List<Estoque> buscarTodos() {

    return estoqueService.buscarTodos();
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/{id}")
  public Estoque buscarPorId(@PathVariable Long id) {
    return estoqueService.buscarPorId(id);
  }

  @DeleteMapping
  public void deletar(Long id) {
    estoqueService.excluir(id);

  }
}
