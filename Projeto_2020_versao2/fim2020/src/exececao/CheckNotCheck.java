package exececao;

public class CheckNotCheck {

	public static void main(String[] args) {
		
		try {
			geraErro();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Erro de exceção");
		}
		System.out.println("FIM");
	}
	
	static void geraErro() {
		throw new RuntimeException ("Ocorreu um erro");
	}
	
	static void geraErro2() throws Exception{
	   throw new Exception("Erro de excecao");
	}
}