package umpramuitos;

import infra.DAO;

public class ObterPedido {

	public static void main(String[] args) {
		
		DAO<Pedido>  dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterById(2);
		
		for(ItemPedido item : pedido.getItens()) {
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
	}

}
