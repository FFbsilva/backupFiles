package  br.com.felipe;

import br.com.felipe.modelo.Tabuleiro;
import br.com.felipe.view.TabuleiroConsole;

public class Aplicacao {
 public static void main(String[] args) {
	 
	 Tabuleiro tabuleiro = new Tabuleiro(6,6,6); 
	 
	 new TabuleiroConsole(tabuleiro);
	 
	
	 System.out.println(tabuleiro);
} 
}
