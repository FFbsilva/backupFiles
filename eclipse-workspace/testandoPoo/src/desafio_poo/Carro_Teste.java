package desafio_poo;

public class Carro_Teste {
 public static void main(String[] args) {
	Carro c2 = new Carro();
	Civic c3 = new Civic();
	
	
	
	System.out.println(c2.status);
	
	c2.ligar();
	c3.ligar();
	
	System.out.println(c3.status);
	
	
	c2.acelerar();
	c2.acelerar();
	
	System.out.println(c2.velocidade);
	
	c2.acelerar();
	c3.acelerar();
	c2.acelerar();
	c3.acelerar();
	c3.acelerar();
	c3.acelerar();
	
	System.out.println(c3.velocidade);
}
}
