package gotowe.zmienne;

public class Inicjalizacja {
	// zmienne statyczne
	static int st = 0;
	
	// zmienne instancyjne
	int inst;

	public static void main(String[] args) {
		// zmienne lokalne
		int lokalna;
		int y;
		
		System.out.println(st);
		//NK System.out.println(inst);
		System.out.println(new Inicjalizacja().inst);

		// błąd kompilacji - aby odczytać zmienną lokalną, musi zostać wcześniej zainicjalizowana (w taki sposób, żeby kompilator miał pewność)
		//NK System.out.println(lokalna);
		
		if(st >= 0) {
			lokalna = 13;
			System.out.println(lokalna); // OK
		}
		//NK System.out.println(lokalna);
		if(st >= 0) {
			lokalna = 10;
		} else {
			lokalna = 20;			
		}
		System.out.println(lokalna); // OK

		do {
			y = 44;
		} while(lokalna > 0);
		
		System.out.println(y);
	}

}
