package reduce_exercicio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Interface_Calculadora {
	
	private String operador;
	private double delta = 0;
	private double resultado = 0.0;
	private Scanner entrada = new Scanner(System.in);
	private Queue<Double> valores = new LinkedList<>();
	
	public Interface_Calculadora() {
		
	}
	
	/*Interface de leitura dos 
	 * dados a serem inseridos
	 * */
	public void LerN() {
		
	System.out.println("Digite à vontade: digite 'q' para sair");
		
	
		while(true){
			
			try {valores.add(Double.valueOf(entrada.nextLine()));
			
			} catch(Exception e) {
				break;
			}		
		}
			
		
	}
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void Somar() {
		 
		while(!valores.isEmpty()) {
			
			double s = this.valores.remove();
			s += this.getResultado();
			
			setResultado(s);
		}
		
	}
	public void Sub() {
		while(!valores.isEmpty()) {
			
			double s = this.valores.remove();
			s -= this.getResultado();
			
			setResultado(s);
		}
	}
	
	public void Multi() {
		setResultado(1);
		while(!valores.isEmpty()) {
			
			double s = this.valores.remove();
			s = s * this.getResultado();
			
			setResultado(s);
		}
	}
	
	public void Div() {
		
	}
	
	public String toString() {
		Iterator<Double> ns = valores.iterator();
		while(ns.hasNext()) {
		
		System.out.println(String.valueOf(ns.next()));
		} return "";
		
	}
	
	/*public void somar(ArrayList<Integer> valores) {
		
		this.valores = valores;
		for(Integer i: valores) delta+= i;
	}*/
	
}