package poo_heranca;

public class Carro {
	
	double velocidade = 0;
	double fatorAcelerar = 5.5;
	double fatorFrear = 2;
	boolean status;
	
	void ligar() {
		this.status = true;
	}
	
	void desligar() {
		this.status = false;
		this.velocidade = 0;
	}
	
	void acelerar() {
		if(this.status) { this.velocidade = this.velocidade + this.fatorAcelerar;}
        else {this.velocidade = 0;}
    }
	
	
}