package br.com.estoque.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.estoque.domain.Estoque;
import br.com.estoque.repository.EstoqueRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class EstoqueService {


  @Autowired
  private EstoqueRepository estoqueRepository;

  @Transactional(readOnly = false)
  public void salvarOuEditar(Estoque estoque) {
    estoqueRepository.save(estoque);
  }

  public List<Estoque> buscarTodos() {
    return estoqueRepository.findAll();
  }

  public Estoque buscarPorId(Long id) {
    return estoqueRepository.findById(id).orElse(new Estoque());
  }

  public void excluir(Long id) {
    Estoque estoque = estoqueRepository.findById(id).get();
    estoqueRepository.delete(estoque);
  }
}
