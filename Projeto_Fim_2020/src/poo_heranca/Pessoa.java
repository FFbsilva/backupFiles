package poo_heranca;

public class Pessoa {
	
	private double peso;
	Alimento a;
	
	Pessoa(double peso){
		setPeso(peso);
	}
	
	public void comer(Alimento a) {
		this.peso += a.getPeso();
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso>=0) {
			this.peso = peso;
		}
		
	}
	
}
