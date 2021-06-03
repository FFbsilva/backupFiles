package modelo.umpraum;

import infra.DAO;

public class NovoAssento {
	public static void main(String[] args) {
		
		Assento assento = new Assento("7D");
		Cliente cliente = new Cliente("Joza Fá", assento);
		
		DAO<Object> dao = new DAO<>();
		
		
		dao.abrirT().
		incluir(assento)
		.incluir(cliente)
		.fecharT()
		.fechar();
	}
}
