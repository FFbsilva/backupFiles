package abstrato;

public class Zoologico {
	
	public static void main(String[] args) {
	
		Reptil joaquim = new Dragao_Comodo();
		
		System.out.println(joaquim.andar());	
		
		Reptil joana = new Dragao_Comodo();
		
		System.out.println(joana.getStatus());
		
		joana.setStatus("15 km");
		
		System.out.println(joana.getStatus());
	}
	
}
