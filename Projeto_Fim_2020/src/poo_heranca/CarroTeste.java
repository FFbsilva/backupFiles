package poo_heranca;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro c1= new Carro();
		
		c1.desligar();
		c1.acelerar();
		
		System.out.println(c1.velocidade);
		
		c1.ligar();
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		c1.desligar();
		
		System.out.println(c1.velocidade);
		
		
	}
}
