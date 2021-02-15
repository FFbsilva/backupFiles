package padroes_observer;

public class Meliante1 implements ObservadorMeliantes {

	  
	private boolean tiro = false;
	
	public boolean isTiro() {
		return tiro;
	}

	public void setTiro(boolean tiro) {
		this.tiro = tiro;
	}

	@Override
	public void avisar(ChegadaHomensEvent chegou) {
		
		System.out.println("Corre que os canas chegaram");
		tiro = true;
		
	}

}
