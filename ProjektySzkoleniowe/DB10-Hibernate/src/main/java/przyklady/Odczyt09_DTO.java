package przyklady;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dto.MiniEmp;
import model.Department;
import model.Employee;

public class Odczyt09_DTO {
    
    public static void main(String[] args) {
   	 System.out.println("Tworzę fabrykę");
   	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("hr");
   	 System.out.println("Tworzę EM");
   	 EntityManager em = emf.createEntityManager();
   	 
   	 System.out.println("Odczyt...");
   	 
   	 TypedQuery<MiniEmp> query = em.createQuery("SELECT new dto.MiniEmp(e.firstName, e.lastName, e.job.jobTitle, e.salary) FROM Employee e", MiniEmp.class);
   	 List<MiniEmp> emps = query.getResultList();
   	 for (MiniEmp emp : emps) {
   		 System.out.println(emp);
   	 }
   	 em.close();
   	 emf.close();
    }

}



