package exececao;

import reduce_exercicio.Aluno;

public class Basico {
	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		
		
		try {
			System.out.println(a.nome);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ocorreu um de parametro"+
			"vazio");
		}
		try {
			System.out.println(7/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Ocorreu o erro" + e.getMessage());
		}
		System.out.println("fim");
		
	}
	
	public static void imprimirAluno(Aluno a) {
		System.out.println(a.nome);
	}
}
