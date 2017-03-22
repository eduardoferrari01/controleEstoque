package br.com.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estoque.domain.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque,Long>{

	
}
