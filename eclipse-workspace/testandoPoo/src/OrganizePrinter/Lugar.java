package OrganizePrinter;

import java.util.ArrayList;
import java.util.List;

public class Lugar {
	
	Impressora pressora;
	String nome;
	ArrayList<Data> datas = new ArrayList<>();
	
	List<Impressora> impressoras = new ArrayList<>();
	
	Lugar(String nome,Impressora pressora){
		
		this.pressora = pressora;
		this.nome = nome;
			
	}
	
	
}
