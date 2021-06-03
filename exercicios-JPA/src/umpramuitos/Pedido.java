package umpramuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private Date data;
	
	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> itens;
	
	

	public Pedido() {
		this(new Date());
	}

	public Pedido(Date data) {
		super();
		this.data = data;
	}

	Integer getId() {
		return id;
	}

	void setId(Integer id) {
		this.id = id;
	}

	Date getData() {
		return data;
	}

	void setData(Date data) {
		this.data = data;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
	
}
