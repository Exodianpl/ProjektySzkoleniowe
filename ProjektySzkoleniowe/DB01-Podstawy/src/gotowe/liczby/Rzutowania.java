package gotowe.liczby;

public class Rzutowania {

	// "Hierarchia" typów prostych:
	// byte < short < int < long < float < double
	// char < int
	
	public static void main(String[] args) {
		int x = 107;
		float f = 3.14f;
		long l3 = 13;

		// rzutowanie niejawne - na zmienną typu "szerszego" można zapisać wartość typu "węższego"
		long l = x;
		float f2 = l3;
		//NK x = l;
		//NK l = f;
		f = l;
		
		// rzutowanie jawne można stosować zawsze; czasem może wiązać się z "popsuciem" wartości liczbowej
		x = (int) l;
		System.out.println(x);
		
		// można stosować jawne rzutowanie nawet gdy nie jest konieczne
		l = (long) x;
		System.out.println(l);
		
		l = 3_000_000_000L;
		x = (int) l;
		System.out.println(x); // zmieniona wartość, ostatnie 32 bity z zapisu tej liczby

		f = 100.99F;
		x = (int)f;  // obcina do wartości całkowitej
		System.out.println(x); // 100
		
		f = 4e9f;
		x = (int)f; // po wyjściu poza zakres przyjmuje MAXINT / MININT
		System.out.println(x);
		
		// Na zmienne typu byte, short i char można wpisywać konkretne wartości całkowite, o ile kompilator widzi, że mieszczą się w zakresie
		
		byte b1 = 100;
		//NK byte b2 = 200;

		x = 100;
		//NK byte b3 = x;
		
		final int fi = 10;
		b1 = fi; // jeśli wartość jest "stałą" (jest final i jest znana w czasie kompilacji)
		
		b1 = 50;
		//NK b1 = x; // bo "nie każdy int mieści się w byte"
		x = b1;  // OK, bo byte mieści się w int
		
		//NK int i3 = 3L;
		
		float f3 = 3L;
		
		
		byte b = 13;
		b = 15;
		//NK b = 130;
		
		//NK b = x;
		b = (byte)x;
		
		//NK wezByte(88);
		wezByte((byte)88);
		wezByte(b);
		System.out.println();
		
		System.out.println(dajByte());
		System.out.println(dajZnak());
	}
	
	static byte dajByte() {
		return 65;
	}

	/* NK
	static byte dajByteInaczej() {
		int x = 65;
		return x;
	}
	*/

	static char dajZnak() {
		return 65;
	}
	
	static void wezByte(byte bbb) {
		System.out.println(bbb);
	}

}
