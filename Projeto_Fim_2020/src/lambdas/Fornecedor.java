package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		
		Supplier<List<Integer>> umLista = () -> Arrays.asList(15,20,78,200,45);
		
		Supplier<List<String>> listaNomer = () -> Arrays.asList("Joao","Ana","Jubileu"
				, "Eustaquio");
		
		System.out.println(umLista.get());
		System.out.println(listaNomer.get());
		
	
	}
}
