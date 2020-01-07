package gotowe.instrukcje;

public class MartwyKod {
	
	void metoda1() {
		System.out.println("OK");
		return;
//		System.out.println("błąd");
//		System.out.println("kolejna linia");
	}
	
	void metoda2() throws Exception {
		System.out.println("OK");
		throw new Exception("katastrofa");
//		System.out.println("błąd");
		
	}

	public static void main(String[] args) {
		if(false) {
			System.out.println("Ala ma kota");
		}
		
		if(true) {
			System.out.println("AAAA");
		} else {
			System.out.println("BBBB");
		}
		
		
//		while(false) {
//			System.out.println("błąd");
//		}
		
		while(true) {
			System.out.println("lkdfjg");
		}
		
//		System.out.println("błąd");
	}
}
