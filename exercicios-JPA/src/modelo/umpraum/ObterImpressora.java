package modelo.umpraum;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterImpressora {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-JPA");
	EntityManager  em = emf.createEntityManager();
	
	
	/*Impressora print1 = new Impressora("HP620");
	Impressora print2 = new Impressora("EPSON L120");
	
	Setor rh = new Setor("RH");
	Setor ti = new Setor("TI");
	*/
	//em.getTransaction().begin();
	//em.persist(print2);
	//em.persist(print1);
	//em.getTransaction().commit();
	
	em.getTransaction().begin();
	
	Impressora finded = em.find(Impressora.class, 2);
	//System.out.println(finded.getModelo());
	finded.setId(8);
	
	em.merge(finded);
	em.flush();
	em.getTransaction().commit();
	
	em.close();
	emf.close();
	
}
}
