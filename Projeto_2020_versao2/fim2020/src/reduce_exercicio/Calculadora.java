package reduce_exercicio;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Interface_Calculadora c = new Interface_Calculadora();
		int oper;
		boolean saida = false;
		String sair;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Adicione os números a serem operados: aperte "
				+ "q para sair: ");
		c.LerN();
		
		System.out.println("Deseja somar-los?: S/n");
		sair = entrada.nextLine();
		
		if(sair.equalsIgnoreCase("s")) {
			c.Somar();
			System.out.println(c.getResultado());
		} else if(sair.equalsIgnoreCase("-")) {
			c.Sub();
			System.out.println(c.getResultado());
		} else if(sair.equalsIgnoreCase("/")) {
			
		}else if(sair.equalsIgnoreCase("*") || sair.equalsIgnoreCase("x")) {
			c.Multi();
			System.out.println(c.getResultado());
		} else {
			System.out.println(c.toString());
		}

		

	}
}