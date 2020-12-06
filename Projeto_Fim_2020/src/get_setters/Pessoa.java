package get_setters;

public class Pessoa {

	private double peso;

	Pessoa(double peso){
		this.setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}
	

	public void setPeso( double peso) {
		this.peso = peso;
	}
}
