package poo_exercicios;

public class Livro implements Publicacao{

	private String titulo;
	private Autor autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto = false;
	private Pessoa leitor;
	
	
	
	public Livro(String titulo, Autor autor, int totPaginas, boolean aberto, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = aberto;
		this.leitor = leitor;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public String toString() {
		return getTitulo();
	}


	@Override
	public void abrir() {
		setAberto(true);
		
	}


	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		setAberto(false);
	}


	@Override
	public int folhear() {
		int total = getTotPaginas();
		return total;
		
	}


	@Override
	public void avancarPag() {
		// TODO Auto-generated method stub
		setPagAtual(getPagAtual()+1);
	}


	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		setPagAtual(getPagAtual()-1);
	}
	
	
	
}
