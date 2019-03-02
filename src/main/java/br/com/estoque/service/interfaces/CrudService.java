package br.com.estoque.service.interfaces;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

public interface CrudService<E> {

  @Transactional(readOnly = false)
  void save(E e);

  public List<E> findAll();

  public E findById(Long id);

  public void delete(Long id);
}
