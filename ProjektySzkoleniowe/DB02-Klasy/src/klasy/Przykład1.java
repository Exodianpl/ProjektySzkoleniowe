package klasy;

public class Przykład1 {

	public static void main(String[] args) {
		Osoba x = new Osoba("Alina", "Chalina");
		System.out.println(x);
		x.przedstawSie();
		
		x.imie = "Ala";
		x.nazwisko = "Kowalska";
		x.przedstawSie();
		System.out.println();
		
		Osoba y = new Osoba("Adam", "Nowak");
		y.przedstawSie();
		
		Osoba z = new Osoba("Cezary");
		z.przedstawSie();
		
		System.out.println(x);		
		System.out.println(y);
		
		//String.valueOf, potrafi zamienić wszystko na String
		
		String s = String.valueOf(x);
		System.out.println(s);
		
		s = String.valueOf(12);
		System.out.println(s);
		
	}
	
}
