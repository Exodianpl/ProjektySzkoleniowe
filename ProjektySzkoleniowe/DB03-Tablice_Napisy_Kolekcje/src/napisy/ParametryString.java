package napisy;

public class ParametryString {

	static void metoda(String s) {
		System.out.println("s: " + s);
		s += " ma kota";
		System.out.println("s: " + s);
	}
	
	public static void main(String[] args) {
		String a = "Ala";
		
		System.out.println("a: " + a);
		metoda(a);
		System.out.println("a: " + a);
	}
	
}
