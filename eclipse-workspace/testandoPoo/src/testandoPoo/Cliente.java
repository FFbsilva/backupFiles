package testandoPoo;

import java.util.ArrayList;

public class Cliente {

	String nome;
	int idade;
	//double total;
	
	ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome, int idade){
		
		this.nome = nome;
		this.idade = idade;
	}
	
	
	void addCompra(Compra c) {
		this.compras.add(c);
		
	}
	
	void addCompra(String produto, int quantidade, double preco) {
		this.addCompra(new Compra(produto,quantidade, preco));
		
	}
	
	void totalF(int posicao) {
		this.compras.get(posicao);
	}
	
	
	
		
	
	
}
