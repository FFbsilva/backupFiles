package generico;

public class CaixaNumeroTeste {
public static void main(String[] args) {
	
	CaixaNumero<Integer> n = new CaixaNumero<Integer>();
	n.guardar(487);
	Integer c = n.abrir();
	System.out.println(c);
}
}
