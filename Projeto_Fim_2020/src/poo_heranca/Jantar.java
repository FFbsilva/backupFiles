package poo_heranca;

public class Jantar {
public static void main(String[] args) {
	
	Pessoa convidado2 = new Pessoa(70.5);
	
	Alimento arroz = new Arroz(0.250);
	Alimento feijao = new Feijao(0.150);
	Alimento sorvete = new Sorvete(0.70);
	
	convidado2.comer(feijao);
	convidado2.comer(arroz);
	
	System.out.println(convidado2.getPeso());
	
	
	
}
}
