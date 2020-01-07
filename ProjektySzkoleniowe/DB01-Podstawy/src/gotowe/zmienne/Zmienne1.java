package gotowe.zmienne;

public class Zmienne1 {
	static int statyczna;
	
	public static void main(String[] args) {
		// zmienne deklarowane na poziomie klasy uzyskują domyslne wartości (0, false lub null)
		System.out.println(statyczna);
				
		// zmienna lokalna - nie ma automatycznej inicjalizacji; typ nie ma znaczenia
		int x;
		// zakaz odczytu dopóki zmienna nie będzie zainicjalizowana
		// błąd kompilacji
		//NK System.out.println(x);
		
		x = 10;
		int y;
		if(x > 5) {
			y = 100;
			System.out.println(y); // tu OK
		}
		
		// błąd kompilacji, bo kompilator "nie ma pewności" czy zmienna y będzie zainicjalizowana
		//NK System.out.println(y);
		
		if(x > 5) {
			y = 200;
		} else {
			y = 300;
		}
		System.out.println(y); // OK
		
		// dopuszczalne od Javy 10 - kompilator sam ustali typ String
		// var imie = "Ala";
		// nielegalne imie = 15;
	}

}
