package br.com.estoque.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "categoria_id_seq", sequenceName = "categoria_id_seq", allocationSize = 1)
@Table(name = "categoria")
public class Categoria implements Serializable {

  private static final long serialVersionUID = 1361294950533607735L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_id_seq")
  private Long id;
  @NotNull
  private String descricao;

}
