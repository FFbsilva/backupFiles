package Desafio;

public class Item {

		int quantidade;
		Produto pro;
		
		Item(int quantidade, Produto c){
			this.quantidade = quantidade;
			this.pro = c;
		}
		
		void addProduto(Produto pro) {
			this.pro = pro;
			
		}
		
		void addProduto(String nome, double preco) {
			this.addProduto(nome, preco);
		}
		
		public String toString() {
			return "[ " + this.quantidade + " ] " + pro.nome + " " + Double.toString(pro.preco);
		}
		
		double obterValor() {
			
			var valorTot = this.quantidade * pro.preco;
			return valorTot;
		}
		
}