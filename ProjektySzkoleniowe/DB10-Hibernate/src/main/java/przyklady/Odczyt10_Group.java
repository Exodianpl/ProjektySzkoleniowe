package przyklady;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dto.MiniEmp;
import model.Department;
import model.Employee;

public class Odczyt10_Group {
    
    public static void main(String[] args) {
   	 System.out.println("Tworzę fabrykę");
   	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("hr");
   	 System.out.println("Tworzę EM");
   	 EntityManager em = emf.createEntityManager();
   	 
   	 System.out.println("Odczyt...");
   	 
   	 TypedQuery<Object[]> query = em.createQuery("SELECT e.job.jobTitle, count(*), avg(e.salary) "
   	 		+ "FROM Employee e GROUP BY e.job.jobTitle", Object[].class);
   	 List<Object[]> emps = query.getResultList();
   	 for (Object[] emp : emps) {
   		 System.out.println(Arrays.deepToString(emp));
   	 }
   	 em.close();
   	 emf.close();
   	 System.out.println("Zamykam.");
    }

}



