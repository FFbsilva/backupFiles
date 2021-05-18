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
	
	Usuario usuario = em.find(Usuario.class, 4L);
	//System.out.println(usuario.getNome());
	usuario.setEmail("braganca@gmail.com");
	usuario.setNome("Felipe Braga");
	em.merge(usuario);
	
	em.getTransaction().commit();
	
	em.close();
	emf.close();
}
}
