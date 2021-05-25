package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	private static EntityManagerFactory emf ;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf= Persistence
				.createEntityManagerFactory("exercicios-JPA");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> abrirT(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharT(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirTotal(E entidade){
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	public List<E> retornarTodos(){
		return this.retornarTodos(10, 0);
	}
	public List<E> retornarTodos(int qtd, int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		String jpql = "select e from " + classe.getName() + "e";
		TypedQuery<E> query = em.createQuery(jpql,classe);
		query.setMaxResults(qtd);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
}