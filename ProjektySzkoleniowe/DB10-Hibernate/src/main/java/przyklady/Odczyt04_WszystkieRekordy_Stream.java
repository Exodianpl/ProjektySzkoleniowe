package przyklady;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import model.Department;
import model.Employee;

public class Odczyt04_WszystkieRekordy_Stream {

    public static void main(String[] args) {

   	 EntityManagerFactory emf = null;
   	 EntityManager em = null;
   	 
   	 try {
   		 emf = Persistence.createEntityManagerFactory("hr");
   		 em = emf.createEntityManager();
   		 
   		 TypedQuery<Employee> query = em.createNamedQuery("Employee.findAll", Employee.class);
   		 
   		 Stream<Employee> lista = query.getResultStream();
   		 
   		 lista.forEach(emp -> {
   			 System.out.println(emp.getFirstName() + " " + emp.getLastName());
   		 });
   		 
   		 
   	 } finally {
   		 if (em != null)
   			 em.close();
   		 if (emf != null)
   			 emf.close();
   	 }
    }
}



