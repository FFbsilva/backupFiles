package teste.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "prod_nome", length = 200, nullable = false)
	private String nome;
	
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	private Double preco;

	
	
	public Produto() {
	
	}
		
	

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}



	Long getId() {
		return id;
	}

	void setId(Long id) {
		this.id = id;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	Double getPreco() {
		return preco;
	}

	void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
