package testandoPoo;

public class LojaTeste {
		
public static void main(String[] args) {
	
	Cliente c1 = new Cliente("Felipe", 20);
	
	Compra compra1 = new Compra("Bola", 2 , 3.99);
	
	c1.addCompra("BolaQuadrada", 2, 3.79);
	c1.addCompra("Jarro", 10, 2.99);
	
	System.out.println(c1.compras.get(0));
}	
}