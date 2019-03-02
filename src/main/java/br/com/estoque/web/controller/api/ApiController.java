package br.com.estoque.web.controller.api;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ApiController<E> {

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  void save(E categoria);

  @ResponseStatus(HttpStatus.CREATED)
  @PutMapping
  void edit(E categoria);

  @ResponseStatus(HttpStatus.OK)
  @GetMapping
  List<E> findAll();

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/{id}")
  E findById(Long id);

  @DeleteMapping
  void delete(Long id);
}
