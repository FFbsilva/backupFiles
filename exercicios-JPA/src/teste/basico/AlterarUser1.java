package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUser1 {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("exercicios-JPA");
	
	EntityManager em = emf.createEntityManager();
	
	em.getTransaction().begin();
	
	Usuario usuario = em.find(Usuario.class, 3L);
	//System.out.println(usuario.getNome());
	usuario.setEmail("chiquinho_low@gmail.com");
	usuario.setNome("Chiquinho da Sul");
	em.merge(usuario);
	
	em.getTransaction().commit();
	
	em.close();
	emf.close();
}
}
