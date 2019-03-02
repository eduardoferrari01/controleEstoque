package br.com.estoque.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.estoque.domain.Categoria;
import br.com.estoque.repository.CategoriaRepository;
import br.com.estoque.service.interfaces.CrudService;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CategoriaService implements CrudService<Categoria> {

  @Autowired
  private CategoriaRepository categoriaRepository;

  public void save(Categoria categoria) {

    categoriaRepository.save(categoria);
  }

  public List<Categoria> findAll() {

    return categoriaRepository.findAll();
  }

  public Categoria findById(Long id) {

    return categoriaRepository.findById(id).orElse(new Categoria());
  }

  public void delete(Long id) {

    Categoria categoria = categoriaRepository.findById(id).get();
    categoriaRepository.delete(categoria);
  }
}
