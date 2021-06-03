package modelo.umpraum;

import infra.DAO;

public class ObterCliente {
public static void main(String[] args) {
	
	DAO<Cliente> dao = new DAO<>(Cliente.class);
	
	Cliente cliente = dao.obterById(3L);
	System.out.println(cliente.getAssento().getNome());
	
	dao.fechar();
	
	DAO<Assento> daoAssento = new DAO<>(Assento.class);
	
	Assento assento = daoAssento.obterById(4L);
	System.out.println(assento.getCliente().getNome());
	daoAssento.fechar();
}
}
