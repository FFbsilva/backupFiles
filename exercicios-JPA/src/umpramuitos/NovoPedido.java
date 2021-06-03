package umpramuitos;

import infra.DAO;
import teste.basico.Produto;

public class NovoPedido {

	public static void main(String[] args) {

		DAO<Object> dao = new DAO<>();
		
		Pedido pedido1 = new Pedido();
		Produto p1 = new Produto("Geladeira",1660.20);
		Produto p2 = new Produto("Televisão 80P", 3640.5);
		
		ItemPedido  item1 = new ItemPedido(5,1660.20,p1,pedido1);
		ItemPedido item2 = new ItemPedido(3,3640.2,p2,pedido1);
		dao.
		abrirT()
		.incluir(p1)
		.incluir(p2)
		.incluir(pedido1)
		.incluir(item1)
		.fecharT()
		.fechar();
	}

}
