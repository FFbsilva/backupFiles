package poo_heranca;

public class Ferrari extends Carro{

	
	@Override
	void acelerar() {
		this.fatorAcelerar = 15.5;
		if(status) { 
			this.velocidade = this.velocidade+this.fatorAcelerar;
		}
	}
}
