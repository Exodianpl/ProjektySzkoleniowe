package pracownicy;

import java.io.File;
import java.util.List;

public class avrSalary {
	
	public static void sredniaZawodu(String jobTitle, List<Employee> employees) {
		double avr_salary = 0;
		int liczba_pracownikow = 0;
		for (Employee emp : employees) {
			//	System.out.println(emp);

				if (emp.getJobTitle().equals(jobTitle)) {
					avr_salary += emp.getSalary();
					++liczba_pracownikow;
				}
			}
		System.out.println("Średnia pensja " + jobTitle + ": " + avr_salary/liczba_pracownikow);
	}
	
	public static void maksymalneZarobki(List<Employee> employees) {
		int maksZarobki = 0;
		for (Employee emp : employees) {
			//	System.out.println(emp);
				if(emp.getSalary() > maksZarobki) {
					maksZarobki = emp.getSalary();
				}
			}
		System.out.println("Maksymalne zarobki :" + maksZarobki);
	}
	
	public static void minimalneZarobki(List<Employee> employees) {
		int miniZarobki = 1000000;
		for (Employee emp : employees) {
			//	System.out.println(emp);
			if(emp.getSalary() < miniZarobki) {
				miniZarobki = emp.getSalary();
			}
		}
		System.out.println("Minimalne zarobki :" + miniZarobki);
	}
	
	public static void sredniaPoZawodzie(List<Employee> employees) {
		
		for(Employee emp : employees) { 
			
		}
		
		
	}
	
	public static void main(String[] args) {
		File plik = new File("pracownicy.csv");
		
		List<Employee> employees = obslugaCSV.wczytaj(plik);
		double avr_salary = 0;
		//System.out.println("Wczytano " + employees.size() + " rekordów.");
		for (Employee emp : employees) {
		//	System.out.println(emp);
			avr_salary += emp.getSalary();
			
		}
		
		avr_salary = avr_salary / employees.size();
		System.out.println("Średnia pensja wszystkich: " + avr_salary);
		
		String programmer = "Programmer";
		int liczba_prog = 0;
		avr_salary = 0;
		for (Employee emp : employees) {
		//	System.out.println(emp);

			if (emp.getJobTitle().equals(programmer)) {
				avr_salary += emp.getSalary();
				++liczba_prog;
			}
		}
		avr_salary = avr_salary / liczba_prog;
		System.out.println("Średnia pensja Programistów: " + avr_salary);
		
		String zawod = "Shipping Clerk";

		Employee minEmployee = employees.get(0);		
		Employee maxEmployee = employees.get(0);
		
		for(Employee emp : employees) {
			if(emp.getSalary() < minEmployee.getSalary()) {
				minEmployee = emp;
			}
			if(emp.getSalary() > maxEmployee.getSalary()) {
				maxEmployee = emp;
			}
		}
		System.out.println("Najmniejsza: " + minEmployee.getSalary() + " " + minEmployee.getLastName() + " " + minEmployee.getFirstName());		
		System.out.println("Najwieksza: " + maxEmployee.getSalary() + " " + maxEmployee.getLastName() + " " + maxEmployee.getFirstName());
		
		
		
		sredniaZawodu(zawod,employees);
		maksymalneZarobki(employees);
		minimalneZarobki(employees);
		sredniaPoZawodzie(employees);
		
	}
	

}


