package generico;

public class CaixaObjetoTeste {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	@SuppressWarnings("rawtypes")
	
	Caixa a = new Caixa();
	Caixa<Integer> b = new Caixa<>();
	
	b.guardar(8);
	a.guardar("Olá mundinho");
	
	String coisaB = (String)a.abrir();
	System.out.println(coisaB);
	
	Integer coisa3 = 200;
	Boolean nãosei = false;
	String frase2 = "Fazendo acontecer";
	
	a.guardar(coisa3);
	System.out.println(b.abrirTipo(frase2));
	System.out.println(a.abrirTipo(coisa3));
	System.out.println(a.abrirTipo(nãosei));
	System.out.println(a.abrirTipo(frase2));
}
}
