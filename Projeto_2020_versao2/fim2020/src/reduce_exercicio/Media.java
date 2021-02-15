package reduce_exercicio;

public class Media {

	private int quantidade;
	private double total;
	
	public Media adicionar(double valor) {
		total += valor;
		quantidade ++;
		return this;
	}
	
	public double getValor() {
		return total / quantidade;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.quantidade = m1.quantidade + m2.quantidade;
		resultante.total = m1.total + m2.total;
		return resultante; 
	}
}