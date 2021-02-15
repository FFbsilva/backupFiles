package padroes_observer;

public class ObserverTest {
public static void main(String[] args) {
	
	Meliante1 melianteZonaSul = new Meliante1();
	Fogueteiro juninho = new Fogueteiro();

	juninho.cadastrarMeliantes(melianteZonaSul);
	juninho.monitorar();
}
}
