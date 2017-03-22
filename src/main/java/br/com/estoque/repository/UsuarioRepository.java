package br.com.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estoque.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

}
