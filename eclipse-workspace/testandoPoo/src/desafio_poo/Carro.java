package desafio_poo;

public class Carro {
	
	boolean status;
	double fatorAcelerar = 1.5;
	double fatorFrear = 1;
	double velocidade = 1;
	
	void ligar() {
		this.status = true;
	}
	
	void desligar() {
		this.status = false;
		this.velocidade = 0;
		
	}
	
	void acelerar() {
		if(status = true) {
			this.velocidade = this.velocidade + this.fatorAcelerar;}
		}
	
	
	void frear() {
		if(status = true) {
			if(this.velocidade >= 1) { this.velocidade = this.velocidade - this.fatorFrear;}
		}else {this.velocidade = 0;}
	}
}