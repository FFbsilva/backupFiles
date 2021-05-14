package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUser1 {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("exercicios-JPA");
	
	EntityManager em = emf.createEntityManager();
	
}
}
