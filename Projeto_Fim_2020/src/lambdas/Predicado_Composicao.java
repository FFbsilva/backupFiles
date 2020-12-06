package lambdas;

import java.util.function.Predicate;

public class Predicado_Composicao {
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate <Integer> isTres = num -> num >= 100 && num>=999;
		
		System.out.println(isPar.or(isTres).test(46));
	
	
	}
}
