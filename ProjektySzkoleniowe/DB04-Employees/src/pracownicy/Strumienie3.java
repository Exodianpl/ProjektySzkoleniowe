package pracownicy;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Strumienie3 {
// nie formatować w Eclipse
    
    public static void main(String[] args) {
   	 File plik = new File("pracownicy.csv");
   	 //List<Employee> employees = ObslugaCSV.wczytaj(plik);
   	 
   	 // Pusta lista, aby przetestować Optionale
   	 List<Employee> employees = Collections.emptyList();
   	 
   	 OptionalInt maksymalnaPensja = employees.stream()
   		 .mapToInt(Employee::getSalary)
   		 .max();
   	 
   	 System.out.println(maksymalnaPensja);
   	 if(maksymalnaPensja.isPresent()) {
   		 int maksymalnaPensjaInt = maksymalnaPensja.getAsInt();
   		 System.out.println(maksymalnaPensjaInt);
   	 }
   	 System.out.println();
   	 
   	 
   	 Optional<Employee> maksymalnyPracownik = employees.stream()
   			 .max(Comparator.comparing(Employee::getSalary));
   	 
   	 // Optionale można obsługiwać "tradycyjne" sprawdzając ifem czy są puste
   	 if(maksymalnyPracownik.isPresent()) {
   		 Employee emp = maksymalnyPracownik.get();
   		 System.out.println("Najwięcej zarabia: ");
   		 System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSalary());
   	 } else {
   		 System.out.println("Nie takiego gościa");
   	 }
   	 System.out.println();
   	 
   	 // Zamiast pisać if-a, z Optionala można korzystać inaczej:
   	 String napis = maksymalnyPracownik
   		 .map(emp -> "Najwięcej zarabia " + emp.getFirstName() + " " + emp.getLastName())
   		 .orElse("Nie ma takiego gościa");
   	 
   	 System.out.println(napis);
   	 
   	 // Rozpisane na pojedyncze kroki:
   	 Optional<Employee> bycMozePracownik = employees.stream()
   		 .min(Comparator.comparing(Employee::getSalary));
   	 
   	 // map zamienia pustego Optionala na pustego Optionala,
   	 // a Optionala który coś zawiera, na Optionala który zawiera wynik funkcji
   	 Optional<String> bycMozeNapis = bycMozePracownik
   		 .map(emp -> "Najmniej zarabia " + emp.getFirstName() + " " + emp.getLastName());
   	 
   	 // orElse: jesli Optional jest pusty, to zwraca podaną domyślną wartość ("Nie znaleziono")
   	 // a jeśli Optional zawierał obiekt, to ten obiekt (w tym przypadku napis "Najmniej zarabia...")
   	 String napis2 = bycMozeNapis.orElse("Nie znaleziono");
   	 
   	 System.out.println(napis2);
   	 
    }

}



