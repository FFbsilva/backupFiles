package padroes_observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Fogueteiro {
	
	Date data = new Date();
	
	ChegadaHomensEvent evento = new ChegadaHomensEvent(data);
	
	public List<Meliante1> meliantes = new ArrayList<>();
	
	public void cadastrarMeliantes(Meliante1 meliante) {
		meliantes.add(meliante);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		String delta ="";
		
		while(!"sair".equalsIgnoreCase(delta)) {
			System.out.println("Os canas chegaram?");
			String resposta = entrada.nextLine();
			
	       if(resposta.equalsIgnoreCase("sim")) {
	    	   meliantes.stream().forEach(m-> m.avisar(evento));
	    	   delta = "sair";
	       }else {
	    	   System.out.println("Tá de boa");
	       }
		
		}
		entrada.close();
	}
}
