package modelo.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	
	private String nome;
	
	@OneToOne
	@JoinColumn(name="assento_id", unique=true)
	private Assento assento;

	public Cliente() {
		
	}

	public Cliente( String nome, Assento assento) {
		super();
		this.nome = nome;
		this.assento = assento;
	}
	

	Assento getAssento() {
		return assento;
	}

	void setAssento(Assento assento) {
		this.assento = assento;
	}

	long getId() {
		return Id;
	}

	void setId(long id) {
		Id = id;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
