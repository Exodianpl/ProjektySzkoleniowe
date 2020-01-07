package pracownicy;

import java.io.File;
import java.util.List;

public class TestOdczytu {

	public static void main(String[] args) {
		File plik = new File("pracownicy.csv");
		
		List<Employee> employees = obslugaCSV.wczytaj(plik);
		
		System.out.println("Wczytano " + employees.size() + " rekordów.");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		
		
		
	}

}
