package Desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		 
		Cliente c2 = new Cliente("Daniel");
		Compra compra1 = new Compra();
		
		
		compra1.addItem(1, "Carreta", 499);
		compra1.addItem(1, "Carro", 100);
		c2.addCompra(compra1);
		
		Cliente c3 = new Cliente("Felipe");
		Compra compra2 = new Compra();
		
		compra2.addItem(2,"Jarro", 2.99);
		compra2.addItem(2,"Prato", 4.99);
		
		c3.addCompra(compra2);
		System.out.println(c2.compra.get(0).toString());
		System.out.println(c3.compra.get(0).toString());
		System.out.println(c3.valorTotalC(compra2));
		
		
	}

	
}
