package lambdas;

import java.util.function.Predicate;

public class Predicato {
public static void main(String[] args) {
	
	Predicate<Produto> isCaro = prod-> (prod.preco*( 1- prod.desconto))<=750; 
	
	Produto carrinho  =  new Produto("Carrinho",389.7,0.78);
	System.out.println(isCaro.test(carrinho));
}
}
