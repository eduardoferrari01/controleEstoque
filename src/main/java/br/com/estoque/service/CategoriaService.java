package br.com.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.estoque.domain.Categoria;
import br.com.estoque.repository.CategoriaRepository;

@Service
@Transactional(readOnly = true,propagation = Propagation.REQUIRED)
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Transactional(readOnly = false)
	public void salvarOuEditar(Categoria categoria)
	{
		categoriaRepository.save(categoria);
	}
	public List<Categoria> buscarTodos()
	{
		return categoriaRepository.findAll();
	}
	public Categoria buscarPorId(Long id)
	{
		return categoriaRepository.findOne(id);
	}
	public void excluir(Long id)
	{
		Categoria categoria = categoriaRepository.findOne(id);
		categoriaRepository.delete(categoria);
	}
}
