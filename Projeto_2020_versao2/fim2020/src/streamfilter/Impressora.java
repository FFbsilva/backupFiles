package streamfilter;

public class Impressora {
	
	final String modelo;
	final double pressoes;
	final boolean novo;
	final String ide;
	
	public Impressora(String modelo, double pressoes, boolean novo, String ide) {
		super();
		this.modelo = modelo;
		this.pressoes = pressoes;
		this.novo = novo;
		this.ide = ide;
	}
	
	public String toString() {
		return this.ide + " do modelo " + this.modelo + " imprimiu tanto " + this.pressoes ;
	}
	
	
}
