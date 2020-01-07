package klasy;

public class Przyklad2 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala","Kowalska");
		
		Konto konto = new Konto(1 , 1000 , ala);
		
		System.out.println(konto);
	
		konto.wplata(300);
		
		System.out.println(konto);
	
	}
	
	
}
