package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {
	public static void main(String[] args) {
		
		
		Impressora p1 = new Impressora("HP", true, 30);
		Impressora p2 = new Impressora("EPSON", true, 100);
		Impressora p3 = new Impressora("HP", false, 29);
		Impressora p4 = new Impressora("EPSON", true, 150);
		Impressora p5 = new Impressora("HP", true, 89);
		Impressora p6 = new Impressora("HP", true, 78);
		Impressora p7 = new Impressora("EPSON", false, 120);
		Impressora p8 = new Impressora("HP", false, 200);
		Impressora p9 = new Impressora("EPSON", false, 175);
		Impressora p10 = new Impressora("HP", true, 230);
		Impressora p11 = new Impressora("XEROX", true, 30);
		Impressora p12 = new Impressora("SAMSUNG", true, 30);

		List<Impressora> impressoras = Arrays.asList(p1, p2 ,p3 ,p4,p5,p6,p7,p8,p8,p10,p11,p12);
		
	
	}
	
}
