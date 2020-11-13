package OrganizePrinter;

import java.util.ArrayList;

public class Data {
	
	int dia;
	int mes;
	int hora;
	
	String ocorrencia;
	
	ArrayList<Impressora> impressos = new ArrayList<>();
	
	Data(DataParameter parameterObject ){
		
		this.dia = parameterObject.dia;
		this.hora = parameterObject.hora; 
	}
	
	
}	
