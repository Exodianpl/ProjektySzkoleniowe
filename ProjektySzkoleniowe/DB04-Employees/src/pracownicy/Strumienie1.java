package pracownicy;

import java.io.File;
import java.util.List;

public class Strumienie1 {

	public static void main(String[] args) {
		File plik = new File("pracownicy.csv");
		List<Employee> employees = obslugaCSV.wczytaj(plik);
		
		System.out.println("stream forEACH: ");
		
		employees.stream().forEach(emp ->System.out.println(emp.getFirstName() + " " + emp.getLastName()));
		System.out.println("==============");
		
		System.out.println("list forEACH:");
		employees.forEach(emp ->System.out.println(" - " + emp.getFirstName() + " " + emp.getLastName()));
		
		System.out.println("stream filter forEach: ");
		employees.stream()
		.filter(emp -> emp.getSalary() > 10000)
		.forEach(emp -> System.out.println(" + " + emp.getFirstName() + " " + emp.getLastName()));
		
		System.out.println("+======================+");
		
		employees.stream()
		.filter(emp -> emp.getSalary() < 5000)
		.map(emp -> " - " + emp.getFirstName() + " " + emp.getLastName())
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}
}
