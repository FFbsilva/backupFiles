package poo_heranca;

public class Civic extends Carro{

	public Civic(int Velocidade, double fatorAce){
		super(Velocidade, fatorAce);
		
	}
    public Civic(){
		this(250, 3.5);
	}
}
