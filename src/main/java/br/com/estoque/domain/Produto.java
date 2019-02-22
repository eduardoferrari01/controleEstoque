package br.com.estoque.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "produto_id_seq", sequenceName = "produto_id_seq", allocationSize = 1)
@Table(name = "produto")
public class Produto implements Serializable {

  private static final long serialVersionUID = -4280341935600596146L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_id_seq")
  private Long id;
  private String descricao;
  @Min(1)
  private Double preco;

  @ManyToOne
  @JoinColumn(name = "id_categoria")
  private Categoria categoria;

}
