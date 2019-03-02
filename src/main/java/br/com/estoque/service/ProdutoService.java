package br.com.estoque.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.estoque.domain.Produto;
import br.com.estoque.repository.ProdutoRepository;
import br.com.estoque.service.interfaces.CrudService;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ProdutoService implements CrudService<Produto> {

  @Autowired
  private ProdutoRepository produtoRepository;

  public void save(Produto produto) {
    produtoRepository.save(produto);
  }

  public List<Produto> findAll() {
    return produtoRepository.findAll();
  }

  public Produto findById(Long id) {
    return produtoRepository.findById(id).orElse(new Produto());
  }

  public void delete(Long id) {
    Produto produto = produtoRepository.findById(id).get();
    produtoRepository.delete(produto);
  }
}
