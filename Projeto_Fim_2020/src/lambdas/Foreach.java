package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		
		List<String> cpfs = Arrays.asList("120","456","789");
		
		System.out.println("Forma tradicional");
		
		for(String registrados: cpfs) {
			System.out.println(registrados);
		}
		
		System.out.println("Lambda versao 1.0");
		cpfs.forEach(registrados-> System.out.println(registrados));
		
		System.out.println("Lambda versao 1.2");
		cpfs.forEach(System.out::println);
	}
}
