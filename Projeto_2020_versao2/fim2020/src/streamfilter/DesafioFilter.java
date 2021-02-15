package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
 public static void main(String[] args) {
	
	 Impressora p1 = new Impressora("HP", 25 , true,"2" );
	 Impressora p2 = new Impressora("EPSON", 120 , false, "5" );
	 Impressora p3 = new Impressora("SAMSUNG", 75 , true,"12" );
	 Impressora p4 = new Impressora("HP", 200 , false, "8" );
	 Impressora p5 = new Impressora("EPSON", 150 , false, "45" );
	 Impressora p6 = new Impressora("XEROX", 800 , false, "48" );
	 Impressora p7 = new Impressora("XEROX", 1500 , false, "49" );
	 Impressora p8 = new Impressora("EPSON", 250 , false, "50" );
	 Impressora p9 = new Impressora("EPSON", 38 , true, "51" );
	 Impressora p12 = new Impressora("EPSON", 58 , true, "52" );
	 Impressora p10 = new Impressora("HP", 85 , true,"21" );
	 Impressora p11 = new Impressora("SAMSUNG", 49 , true,"32" );
	 
	 List<Impressora> impressoras = Arrays.asList(p1,p2,p4,p3,p12,p5,p6,p7,p8,p9,p10,p11);
	 Predicate<Impressora> ehNovo = p -> p.novo ;
	 Predicate<Impressora> printes = p-> p.modelo == "EPSON";
	 Function<Impressora,String> escolhido = p-> p.ide + " voce imprimiu" + p.pressoes;
	 
	 impressoras.stream().filter(ehNovo).filter(printes).
	 map(escolhido).forEach(System.out::println);
	 
 }
}
