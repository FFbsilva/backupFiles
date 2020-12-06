package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Apresentar_Streams {
public static void main(String[] args) {
	
	List<String> aprovados = Arrays.asList("Array", "No","Sei");
	
	for(String aprova: aprovados) {
		System.out.println(aprova);
	}
	
	System.out.println("\n Usando o Iterator \n");
	
	Iterator<String> iterador = aprovados.iterator();
	while(iterador.hasNext()) {
		System.out.println(iterador.next());
	}
	
	System.out.println("\n Usando Stream \n");
	Stream<String> streamer = aprovados.stream();
	streamer.forEach(System.out::println);
}
}
