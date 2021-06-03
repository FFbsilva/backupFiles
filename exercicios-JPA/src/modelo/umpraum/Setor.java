package modelo.umpraum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "setor")
public class Setor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name= "nm_setor", nullable = false, unique = true)
	private String nome;

	Integer getId() {
		return id;
	}

	public Setor() {
		
	}

	public Setor(String nome) {
		super();
		this.nome = nome;
	}

	void setId(Integer id) {
		this.id = id;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}
}
