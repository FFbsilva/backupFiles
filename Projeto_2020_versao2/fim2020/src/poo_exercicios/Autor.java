package poo_exercicios;

import java.util.ArrayList;
import java.util.List;

public class Autor {

	private List<Livro> livrosAutorais = new ArrayList<>();
	
	public void cadastrarLivros(Livro livro) {
		
		livrosAutorais.add(livro);
	}
	
	public void retornarLivros() { 
		livrosAutorais.stream().forEach(System.out::println);
	}
	
}
