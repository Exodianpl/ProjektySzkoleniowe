package dziedziczenie;

import java.time.LocalDate;

public class Przyklad3 {
	public static void main(String[] args) {
		Osoba osoba = new Osoba("Ala", "Kowalska",LocalDate.of(1989, 4, 15));
		System.out.println(osoba);
		
		System.out.println();
		
		Student student = new Student();
		
		System.out.println(student);
	
	}
}
