package Desafio;

import java.util.ArrayList;

public class Compra {
	
	double valorTot;
	Produto p ;
	Cliente cl;
	ArrayList<Item> item = new ArrayList<>();
	
	
	double obterValor(){
		
		for (Item ig :item) {
			valorTot += ig.obterValor();
		}
		
		return valorTot;
	}
	
	void addItem(Item i){
		this.item.add(i);
	}

	
	void addItem(int quantidade, String nome, double preco) {
		this.addItem(new Item(quantidade, new Produto(nome,preco)));
	}
	
	public String toString() {
		return this.item.toString();
	}


}