package dziedziczenie;

import java.time.LocalDate;

public class Osoba {
	String imie, nazwisko;
	LocalDate dataUrodzenia;
	
	Osoba(){
		
	}
	
	
	Osoba(String imie){
		this.imie = imie ;
		this.nazwisko = imie ;
	}
	
	Osoba(String x, String y, LocalDate dataUrodzenia){
	this.imie = x;
	this.nazwisko = y;
	this.dataUrodzenia = dataUrodzenia;
	}
	
	
	void przedstawSie() {
		System.out.println("Nazwam się " + imie + " " + nazwisko);
	}

	
	//Nadpisanie metody domyślnie dołączonej do naszej klasy
	public String toString() {
		return imie + " " + nazwisko;
	}


}

