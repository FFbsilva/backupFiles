package modelo.basico;

import java.util.Scanner;

import infra.DAO;
import teste.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		String nome;
		double preco;
		System.out.println("Digite o nome do produto");
		nome = entrada.nextLine();
		
		System.out.println("Digite o preço do produto");
		preco = entrada.nextDouble();
		
		Produto produto = new Produto(nome, preco);
		
		entrada.close();
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirTotal(produto).fechar();
		
	}
}
