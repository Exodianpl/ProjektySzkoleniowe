/*
package pracownicy;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class Strumienie2 {

	public static void main(String[] args) {
		File plik = new File("pracownicy.csv");
		List<Employee> employees = obslugaCSV.wczytaj(plik);
		
		double srednia1 = employees.stream()
				.collect(Collectors.averagingInt(Employee::getSalary));

		
		System.out.println(srednia1);
		
		double srednia2 = employees.stream()
				.mapToInt(Employee::getSalary)
				.average()
				.getAsDouble();
		System.out.println(srednia2);
	}
	
}

*/
package pracownicy;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class Strumienie2 {

    public static void main(String[] args) {
   	 File plik = new File("pracownicy.csv");
   	 List<Employee> employees = obslugaCSV.wczytaj(plik);
   	 
   	 double srednia1 = employees.stream()
   		 .collect(Collectors.averagingInt(Employee::getSalary));
   	 System.out.println(srednia1);
   	 
   	 
   	 double srednia2 = employees.stream() // List<Employee> => Stream<Employee>
   		 .mapToInt(Employee::getSalary)   // Stream<Employee> => IntStream
   		 .average()                   	// IntStream => OptionalDouble
   		 .getAsDouble();              	// OptionalDouble => double
   	 System.out.println(srednia2);
   	 

   	 double srednia3 = employees.stream()
   			.filter(emp -> emp.getJobTitle().equals("Programmer"))
   			.collect(Collectors.averagingInt(Employee::getSalary));
   	 System.out.println(srednia3);
   	 
    }

}




