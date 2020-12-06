package poo_heranca;

public class Carro {
	
 public	double velocidade = 0;
	public double fatorAcelerar = 5.5;
	public double fatorFrear = 2;
	public boolean status;
	public final double VELOCIDADE_MAXIMA;
	
  public Carro(int velocidadeMaxima, double fatorAce){

		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
		this.fatorAcelerar =  this.fatorAcelerar + fatorAce;
	}
	
	public void ligar() {
		this.status = true;
	}
	
	public void desligar() {
		this.status = false;
		this.velocidade = 0;
	}
	
	public void acelerar() {
		if(this.status && this.velocidade < VELOCIDADE_MAXIMA) { this.velocidade = this.velocidade + this.fatorAcelerar;}
        else {this.velocidade = 0;}
    }
	
	
}