package teste.basico;

import java.util.List;

import infra.ProdutoDAO;

public class ObterProdutos {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> lista = dao.retornarTodos();
		
		for(Produto produtos:lista) {
			System.out.println("ID: " +produtos.getId()+ "Nome: "
					+ ""+ produtos.getNome());
		}
		
		double precoTotal = lista.stream().map(p -> p.getPreco())
				.reduce(0.0,(t,p) -> t+p).doubleValue();
		
		System.out.println("O preço total é R$ " + precoTotal + " reais");
	}

}
