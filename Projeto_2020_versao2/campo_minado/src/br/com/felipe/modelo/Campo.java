package br.com.felipe.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.felipe.excecao.ExplosaoException;

public class Campo {
	
	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	private final int linha;
	private final int coluna;
	
	private boolean minado; 
	private boolean aberto;
	private boolean marcado;
	
	public Campo(int linha,int coluna){
		this.linha  = linha;
		this.coluna = coluna;
		
	}
	
	private List<Campo> vizinhos = new ArrayList<>(); 
	
	public boolean adicionarVizinho(Campo vizinho) {
		boolean isDiferenteLinha = linha != vizinho.linha;
		boolean isDiferenteColuna = coluna != vizinho.coluna;
		boolean diagonal = isDiferenteLinha && isDiferenteColuna;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs( coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		 
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		 } else if(deltaGeral == 2 && diagonal) {
			 vizinhos.add(vizinho);
			 return true;
		 } else {
			 return false;
		 }
		
	}
	
	void minar() {
		minado = true;
		
	}
	
	public void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	boolean abrir() {
		
		if(!aberto && !marcado) {
			aberto = true;
		
			if(minado) {
				throw new ExplosaoException();
			}
			
			if(vizinhaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
		} else {  return false; }
	}
	
	boolean vizinhaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	long minasNaVizinhaca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		
		aberto = false;
		minado =  false;
		marcado = false;
	}
	
	public String toString() {
		if(marcado) {
			return "x";
		}else if(aberto && minado) {
			return "*";
		}else if(aberto && minasNaVizinhaca()> 0) {
			return Long.toString(minasNaVizinhaca());
		}else if (aberto) {
			return " ";
		}else {
			return "?" ;
		}
		
	}
}
