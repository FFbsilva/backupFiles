package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("exercicios-JPA");
		
		EntityManager em = emf.createEntityManager();
		
		
		Usuario usuario1 = em.find(Usuario.class, 2L);
		System.out.println(usuario1.getNome());
	}
}
