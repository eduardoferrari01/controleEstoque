package br.com.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.estoque.domain.Produto;
import br.com.estoque.repository.ProdutoRepository;

@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Transactional(readOnly = false)
	public void salvarOuEditar(Produto produto)
	{
		produtoRepository.save(produto);
	}
	@Transactional(readOnly = false)
	public void excluir(Long id)
	{
		Produto produto = produtoRepository.findOne(id);
		produtoRepository.delete(produto);
	}
	public List<Produto> buscarTodos()
	{
		return produtoRepository.findAll();
	}
	public Produto buscarPorId(Long id)
	{
		return produtoRepository.findOne(id);
	}
	
}
