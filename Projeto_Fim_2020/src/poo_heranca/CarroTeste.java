package poo_heranca;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro c1= new Carro(200,3);
		
		c1.desligar();
		c1.acelerar();
		
		System.out.println(c1.velocidade);
		
		c1.ligar();
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		c1.desligar();
		
		System.out.println(c1.velocidade);

		Carro cF = new Ferrari();
		
		cF.ligar();
		
		
		System.out.println(cF.velocidade);
		
		cF.acelerar();
		cF.acelerar();
		cF.acelerar();
		cF.acelerar();
		
		
		System.out.println(cF.velocidade);
	}
}