package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoveUser {

	public static void main(String[] args) {
		
		EntityManagerFactory emf =  Persistence.
				createEntityManagerFactory("exercicios-JPA");
		
		EntityManager em = emf.createEntityManager();
		
		Usuario usuarior = em.find(Usuario.class, 4L);
		
		if(usuarior != null) {
			
			em.getTransaction().begin();
			em.remove(usuarior);
			em.getTransaction().commit();
		}
		
		emf.close();
		em.close();
		
	}
}
