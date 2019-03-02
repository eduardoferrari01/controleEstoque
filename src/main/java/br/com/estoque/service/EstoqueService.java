package br.com.estoque.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.estoque.domain.Estoque;
import br.com.estoque.repository.EstoqueRepository;
import br.com.estoque.service.interfaces.CrudService;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class EstoqueService implements CrudService<Estoque> {

  @Autowired
  private EstoqueRepository estoqueRepository;

  public void save(Estoque estoque) {
    estoqueRepository.save(estoque);
  }

  public List<Estoque> findAll() {
    return estoqueRepository.findAll();
  }

  public Estoque findById(Long id) {
    return estoqueRepository.findById(id).orElse(new Estoque());
  }

  public void delete(Long id) {
    Estoque estoque = estoqueRepository.findById(id).get();
    estoqueRepository.delete(estoque);
  }
}
