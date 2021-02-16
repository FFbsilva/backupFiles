package poo_exercicios;

public class ProjetoLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa1 = new Pessoa("Flavia",20,'F');
		Autor autor1 = new Autor();
		Livro livro1 = new Livro("A volta dos que não foram",autor1,350,false,pessoa1);
		
		pessoa1.fazerNiver();
		System.out.println(pessoa1.getIdade());
		pessoa1.fazerNiver();
		pessoa1.ler(livro1);
		
		livro1.abrir();
		
		System.out.println(livro1.isAberto());
		livro1.fechar();
		System.out.println(livro1.isAberto());
		
		autor1.cadastrarLivros(livro1);
		autor1.retornarLivros();
		
		
	}

}