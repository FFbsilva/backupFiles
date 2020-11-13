package testandoPoo;

public class  Compra{

	int quantidade;
	double preco;
	String produto;
	String toNome;
	double total = 0;
	
	Compra(String produto, int quantidade, double preco){
		this.produto = produto;
		this.preco = preco;
		this.quantidade =  quantidade;
		
		for(int i= 0; i < this.quantidade; i++) {
			this.total = this.total+ this.preco;
		}
	}
	
	double total() {
		return total;
	}
	public String toString() {
		
		//toNome = this.produto + " custando "+ this.preco +" adicionado com "
			//	+ " determinada quantidade: " + this.quantidade;		
		return "["+this.produto + "]" + "["+ this.preco + "]"+"["+ this.quantidade+"]";
				
	}
	
}
