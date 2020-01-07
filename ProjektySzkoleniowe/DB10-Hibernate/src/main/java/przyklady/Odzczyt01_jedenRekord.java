package przyklady;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Employee;

public class Odzczyt01_jedenRekord {

	public static void main(String[] args) {
		System.out.println("Początek programu.");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hr");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Udało się połączyć, em = " + em);
		
		Employee emp = em.find(Employee.class,  100);
		if(emp == null) {
			System.out.println("Nie znaleziono");
			
		} else {
			System.out.println(emp.getFirstName() + " " + emp.getLastName());
		}
	
		em.close();
		emf.close();
	}
	
}
