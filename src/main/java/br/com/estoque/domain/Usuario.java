package br.com.estoque.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "usuario_id_seq", sequenceName = "usuario_id_seq", allocationSize = 1)
@Table(name = "usuario")
public class Usuario implements Serializable {

  private static final long serialVersionUID = 3864954131267343247L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_seq")
  private Long id;
  private String nome;
  private String senha;
  private String login;
  private String email;

}
