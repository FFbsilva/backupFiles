package lambdas;

public interface Calculo {
	
	double excecutar(double a, double b);
	
	default String padrao( ) {
		return "Retornei nada";	}
}
