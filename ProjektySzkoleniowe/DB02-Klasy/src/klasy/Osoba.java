package klasy;

public class Osoba {
	String imie, nazwisko;
	
	Osoba(String imie){
		this.imie = imie ;
		this.nazwisko = imie ;
	}
	
	Osoba(String x, String y){
	imie = x;
	nazwisko = y;
	}
	
	
	void przedstawSie() {
		System.out.println("Nazwam się " + imie + " " + nazwisko);
	}

	
	//Nadpisanie metody domyślnie dołączonej do naszej klasy
	public String toString() {
		return imie + " " + nazwisko;
	}


}

