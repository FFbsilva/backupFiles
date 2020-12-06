package lambdas;

import java.util.function.UnaryOperator;

public class Operador_Unario {
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> aoQuadrado = n-> n*n;
		
		int resultado = maisDois.andThen(aoQuadrado).apply(4);
		System.out.println(resultado);
	}
}
