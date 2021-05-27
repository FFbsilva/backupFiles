package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Modelo1 {

	public static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("exercicios-JPA");
	public static EntityManager em = emf.createEntityManager();
	
	
	public static void main(String[] args) {
	
		
		Aluno a1 = new Aluno("Pedro Alves", false, "6Serie");
		em.getTransaction().begin();
		em.persist(a1);
		
		em.getTransaction().commit();
		
}
}
