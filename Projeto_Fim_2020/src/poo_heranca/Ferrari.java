package poo_heranca;

public class Ferrari extends Carro{

	Ferrari(){
		this(350, 7.5);
	}
	
	Ferrari(int velocidadeMax, double fatorAce){
		super(velocidadeMax, fatorAce);
	}
	
	@Override
	void acelerar() {
		if(status) { 
			this.velocidade = this.velocidade+this.fatorAcelerar;
		}
	}
}
