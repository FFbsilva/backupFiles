package lambdas;

public class Calculotestes {
public static void main(String[] args) {
	
	Calculo calc = (d,e)-> { return d+e; };
	
	System.out.println(calc.excecutar(5, 8));
	
	calc = (d,e)-> d-e;
	
	System.out.println(calc.excecutar(8, 5));
	
	calc = (e,f)-> e/f;
	System.out.println(calc.excecutar(10, 2));
	
	Soma somas =  new Soma();
	
	System.out.println(somas.somar(12, 20));
	
	
	
}
}
