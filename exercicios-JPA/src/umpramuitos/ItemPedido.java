package umpramuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import teste.basico.Produto;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	 @Column(name = "item_qtd", nullable = false)
	 private int quantidade;
	 
	 @ManyToOne
	 private Produto produto;

	 @ManyToOne
	 private Pedido pedido;
	 
	 @Column(name = "item_ped_preco", nullable = false)
	 private Double preco;
	 
	 
	 public ItemPedido() {
		 
	 }
	 
	 public ItemPedido(int quantidade, Double preco, Produto produto,Pedido pedido) {
		 super();
		 this.setQuantidade(quantidade);
		 this.setProduto(produto);
		 this.setPedido(pedido);
	 }
	 
	 Produto getProduto() {
		return produto;
	}

	void setProduto(Produto produto) {
		this.produto = produto;
		
		if(produto != null && this.preco == null) {
			this.setPreco(produto.getPreco());
		}
	}

	Pedido getPedido() {
		return pedido;
	}

	void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	 

	Integer getId() {
		return id;
	}

	void setId(Integer id) {
		this.id = id;
	}

	int getQuantidade() {
		return quantidade;
	}

	void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	Double getPreco() {
		return preco;
	}

	void setPreco(Double preco) {
		this.preco = preco;
	}


	 
	 
}
