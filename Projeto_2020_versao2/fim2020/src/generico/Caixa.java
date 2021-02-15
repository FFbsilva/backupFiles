package generico;

public class Caixa<T> {
	
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
	
	public String abrirTipo(Object c) {
		
		String frase = "Soy jo";
		Integer numero = 5;
		Boolean vouf = true;
		String resultado;
		
		
		if(c.getClass() == frase.getClass()) {
			resultado = "Objeto citado é uma String" ;
		}else if(c.getClass() == numero.getClass()) {
			resultado = "Objeto citado é um número";
		} else if(c.getClass() == vouf.getClass()) {
			resultado = "Objeto citado é um Boolean";
		}else {
			resultado = "Não sei que objeto é esse";
		}
		return resultado;
	}
}
