package br.com.estoque.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.estoque.domain.Usuario;
import br.com.estoque.repository.UsuarioRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class UsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Transactional(readOnly = false)
  public void salvarOuEditar(Usuario usuario) {
    usuarioRepository.save(usuario);
  }

  @Transactional(readOnly = false)
  public void excluir(Long id) {
    Usuario usuario = usuarioRepository.findById(id).get();
    usuarioRepository.save(usuario);
  }

  public List<Usuario> buscarTodos() {
    return usuarioRepository.findAll();
  }

  public Usuario buscarPorId(Long id) {
    return usuarioRepository.findById(id).orElse(new Usuario());
  }
}
