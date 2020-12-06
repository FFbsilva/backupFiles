package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		
		
		Function<Produto, Double> valorDesconto = p-> p.preco * (1-p.desconto);
		
		UnaryOperator<Double> imposto = preco-> preco >= 2500  ? preco * 1.085 : preco;
		UnaryOperator<Double> frete =  preco -> preco >= 3000 ? preco + 100 : preco + 50;
		Function<Double,Double> arredondamento = preco -> Double.valueOf(String.format("%.2f", preco).replace(",", "."));
		Function<Double,String> formatar = preco-> ("R$ " + preco).replace('.', ',') ;
		
		/*Double precoFinal = valorDesconto
				.andThen(imposto)
			    .andThen(frete)
			    .andThen(arredondamento).apply(produtos);
		*/
		
		Produto produtos = new Produto("iPad", 3235.89, 0.13);
	
		String p = valorDesconto.andThen(imposto).andThen(frete).andThen(arredondamento).andThen(formatar).apply(produtos);
		System.out.println(p);
		
		
	
	}
}
