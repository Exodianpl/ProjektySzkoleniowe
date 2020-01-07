package gotowe.instrukcje;

public class Switch8 {

	public static void main(String[] args) {
		int x = 2;
		
		switch(x) {
		// to jest po prostu operacja arytmetyczna (dokładnie "suma bitowa")
		// nie ma to żadnego szczególnego znaczenia dla switch-a
		// w tym konkretnym miejscu to wylicza się do wartości 3
		case 2 | 3:
			System.out.println("2 | 3");
			break;
//NK		case 3:
//			System.out.println("3");
		case 2: // bo to nie jest anruszeni unikalności
			System.out.println("2");
			break;
		default:
			System.out.println("default");
		}

	}

}
