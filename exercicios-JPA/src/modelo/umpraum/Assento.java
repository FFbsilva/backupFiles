package modelo.umpraum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="assentos")
public class Assento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "nome_assento",unique = true)
	private String nome;
	
	@OneToOne(mappedBy = "assento")
	private Cliente cliente;
	
	Cliente getCliente() {
		return cliente;
	}


	void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Assento() {
	
	}


	public Assento(String nome) {
		super();
		this.nome = nome;
	}


	long getId() {
		return id;
	}


	void setId(long id) {
		this.id = id;
	}


	String getNome() {
		return nome;
	}


	void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
