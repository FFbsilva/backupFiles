package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {

	@Column(name = "aluno_nm",nullable = false,length = 260)
	private String nome;
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="aluno_ativo")
	private boolean ativo;
	
	@Column(name="serie")
	private String serie;
	
	
	
	public Aluno(String nome, boolean ativo, String serie) {
		super();
		this.nome = nome;
		this.ativo = ativo;
		this.serie = serie;
	}

	public Aluno() {
		super();
	}
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	boolean isAtivo() {
		return ativo;
	}
	void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	String getSerie() {
		return serie;
	}
	void setSerie(String serie) {
		this.serie = serie;
	}
}
