package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprime = p -> System.out.println(p.nome + " custando R$ " + p.preco);
		
		Produto p2 = new Produto("Caneta", 3.89, 0.50);
		
		imprime.accept(p2);
		
		Produto p4 = new Produto("Caderno", 20.89, 0.50);
		Produto p3 = new Produto("Borracha", 4.00, 0.50);
		Produto p5 = new Produto("Lapisera", 8.89, 0.20);
		Produto p6= new Produto("Régua", 5.89, 0.30);
		Produto p7 = new Produto("Apontador", 1.78, 0.50);
	
		List<Produto> produtos = Arrays.asList(p2, p3, p4, p5, p6, p7);
		
		produtos.forEach(imprime);
		
		System.out.println("Passando uma funcao lambda no forEach:");
		produtos.forEach(p-> System.out.println(p.preco));
		
		System.out.println(0);
}
}
