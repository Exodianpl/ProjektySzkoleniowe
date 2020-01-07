package klasy;

public class Referencje1 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalaska");
		Osoba ola = new Osoba("Ola", "Mak");

		Konto a = new Konto(1, 1000, ala);
		Konto b = new Konto(2, 1500, ola);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a.wplata(2500);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		Konto c = b;
		
		System.out.println("c: " + c);
		
		b.wplata(4500);

		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
	
	}
	
}
