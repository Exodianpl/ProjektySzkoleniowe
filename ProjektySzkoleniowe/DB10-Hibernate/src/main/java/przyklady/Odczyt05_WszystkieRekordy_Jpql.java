package przyklady;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import model.Department;
import model.Employee;

public class Odczyt05_WszystkieRekordy_Jpql {

    public static void main(String[] args) {

   	 EntityManagerFactory emf = null;
   	 EntityManager em = null;
   	 
   	 try {
   		 emf = Persistence.createEntityManagerFactory("hr");
   		 em = emf.createEntityManager();
   		 
   		 TypedQuery<Employee> query = em.createQuery("SELECT emp FROM Employee emp", Employee.class);
   		 List<Employee> lista = query.getResultList();
   		 System.out.println("Ilość Rekordów: " + lista.size());
   		 for(Employee employee : lista) {
   			 System.out.println(employee.getFirstName() + " " + employee.getLastName());
   		 }
   		 
   		 
   	 } finally {
   		 if (em != null)
   			 em.close();
   		 if (emf != null)
   			 emf.close();
   	 }
    }
}



