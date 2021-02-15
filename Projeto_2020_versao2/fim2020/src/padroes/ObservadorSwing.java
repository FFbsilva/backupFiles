package padroes;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObservadorSwing {
public static void main(String[] args) {
	
	JFrame  janelaMain = new JFrame("Observador");
	janelaMain.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	janelaMain.setSize(700,500);
	janelaMain.setLayout(new FlowLayout());
	
	JButton botao1 = new JButton("Clique aqui");
	
	janelaMain.add(botao1);
	
	janelaMain.setVisible(true);
}
}
