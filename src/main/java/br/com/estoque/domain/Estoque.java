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
@SequenceGenerator(name = "estoque_id_seq", sequenceName = "estoque_id_seq", allocationSize = 1)
@Table(name = "estoque")
public class Estoque implements Serializable {

  private static final long serialVersionUID = 5751611338114418400L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estoque_id_seq")
  private Long id;
  @Min(1)
  private Integer quantidade;
  private String localizacao;
  @ManyToOne
  @JoinColumn(name = "id_produto", unique = true)
  private Produto produto;
  private Double valorTotal;

}
