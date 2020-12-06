package lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		
		Function<Integer,String> par_Impar = numero -> 
				numero % 2 == 0 ? "Par": "Impar";
				
		System.out.println(par_Impar.apply(20));
		
		Function<String,String> oResultado = valor -> "O resultado é "+valor;
		
		Function<String, String> que = valor -> valor+"!!!!";
		
		String resultadoFim= par_Impar.andThen(oResultado).andThen(que).apply(20);
		
		System.out.println(resultadoFim);
		
	}
}
