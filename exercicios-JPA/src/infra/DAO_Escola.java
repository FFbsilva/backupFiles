package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO_Escola<A> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<A> classe;
	//private long identifica;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-JPA");
			
		}catch (Exception e) {
		
			e.printStackTrace(); 
		}
	}

	public DAO_Escola() {
		this(null);
	}
	
	public DAO_Escola(Class<A> classe) {
		super();
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO_Escola<A> abrirT(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO_Escola<A> fecharT(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO_Escola<A> incluirT(A classe){
		em.persist(classe);
		return this;
	}

	
	public List<A> buscarT(int quantidade ,int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException();
		}
		String jpql = "Select a from" + classe.getName() + "a";
		TypedQuery<A> query = em.createQuery(jpql,classe);
			query.setMaxResults(quantidade);
			query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public DAO_Escola<A> excluirT(Class<A> classe){
		this.classe = classe; 
		em.remove(classe);;
		return this;
	}
	
	public DAO_Escola<A> incluirFull(A classe){
		this.abrirT().incluirT(classe).fecharT();
		return this;
	}
	
	public void fecharEm(){
		em.close();
	}
	
	
	
	
	
	
	
	
}
