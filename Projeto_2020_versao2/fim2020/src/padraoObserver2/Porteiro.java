package padraoObserver2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	Date data = new Date();
	EventoAniversariante evento = new EventoAniversariante(data);
	private List<Parente> parentes = new ArrayList<>(); 
	
	public void conhecer(Parente parente) {
		parentes.add(parente);
	}
	
	public void interfone() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		String saida = "";
		
		while(!saida.equalsIgnoreCase("sim")) {
			System.out.println("Ela chegou::");
			String resposta = entrada.nextLine();
			
			if(resposta.equalsIgnoreCase("sim")) {
				
			}
		}
	}
}
