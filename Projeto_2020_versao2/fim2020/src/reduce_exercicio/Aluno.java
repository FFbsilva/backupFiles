package reduce_exercicio;

public class Aluno {
	 
    public String nome;
	boolean comportamento;
	double nota;
	
	public Aluno(){
		super();
		this.nome =  null;
	}
	
	public Aluno (String nome, double nota) {
		this(nome,true,nota);
	}
	
	public Aluno(String nome, boolean comportamento, double nota) {
		this.nome = nome;
		this.comportamento = comportamento;
		this.nota = nota;
	}
	
	public String toString() {
		return this.nome + " com nota " + this.nota; 
	}
	
	
}
