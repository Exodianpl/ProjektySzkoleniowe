package gotowe.operatory;

public class Leniwosc4 {
	public static void main(String[] args) {
		if(args.length >= 1 && "Ala".equalsIgnoreCase(args[0])) {
			System.out.println("Ala ma kota");
		}
		
		String imie = "Ala";
		
		if(imie != null && imie.length() >= 5) {
			System.out.println("długie imię");
		}
		
		if(imie == null || imie.isEmpty()) {
			System.out.println("Brak danych");
		}

	}
	
}
