package reduce_exercicio;

public class Mediateste {
	public static void main(String[] args) {
		
		Media m1 = new Media();
		Media m2 = new Media().adicionar(10).adicionar(10);
		
		m1.adicionar(15).adicionar(15);
		System.out.println(m2.getValor());
		System.out.println(m1.getValor());
		
		Media resultante = Media.combinar(m1,m2);
		
		System.out.println(resultante.getValor());
	}
}
