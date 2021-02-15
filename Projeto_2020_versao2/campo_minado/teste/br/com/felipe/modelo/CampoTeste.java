package br.com.felipe.modelo;



import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.felipe.excecao.ExplosaoException;
import br.com.felipe.modelo.Campo;


public class CampoTeste {

	private Campo campo;
	
	@BeforeEach
	void testeVizinhoReal() {
	campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoEsquerda() {
		Campo vizinho =  new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDireita() {
		Campo vizinho = new Campo(3,1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	@Test
	void testeAlternarMarcacao() {
		 assertFalse(campo.isMarcado());
	}
	@Test
	void testeAlternarMarcacaoMudado() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao2vezes() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.minar();
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirCampoMarcado() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertTrue(campo.abrir());
	}
	@Test
	void testeAbrirCampoMinado() {
		campo.minar();
		assertThrows(ExplosaoException.class, ()->{campo.abrir();});
	}
	
	
	
	
}
