package Desafio;

import java.util.ArrayList;

public class Cliente {
	 
	String nome;
	ArrayList<Compra> compra = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	public void addCompra(Compra c){
	  this.compra.add(c);
	}
	
	double valorTotalC(Compra c) {
		
		double valorX;
		valorX = c.obterValor();
		
		return valorX;
	}
	
	
	public String toString() {
		return this.nome ;
	}
	
}
