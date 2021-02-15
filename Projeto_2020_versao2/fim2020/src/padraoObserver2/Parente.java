package padraoObserver2;

public class Parente implements ObservadorOlheiro {

	@Override
	public void chegou(EventoAniversariante evento) {

		System.out.println("Mamãe chegou");
	}

	

}
