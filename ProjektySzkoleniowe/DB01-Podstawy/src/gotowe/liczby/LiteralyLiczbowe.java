package gotowe.liczby;

public class LiteralyLiczbowe {

	public static void main(String[] args) {
		int x;

		x = 123; // format dziesiętny
		System.out.println(x);

		x = 0123; // system ósemkowy
		//NK x = 08;  // cyfry od 0 do 7
		System.out.println(x);

		x = 0x100; // system szesnastkowy
		System.out.println(x);
		x = 0x7F;
		System.out.println(x);

		// system dwójkowy - od Javy 7
		x = 0b1101;
		System.out.println(x);

		// odstępy pomiędzy cyframi - od Javy 7
		x = 2_000_000;
		System.out.println(x);
		
		//NK long l = 4000000000; // wartość nie mieszcząca się w int
		long l = 4000000000L; // OK
		
		//int _1000 = 0;
		
		//x = _1000;  // odwołanie do zmiennej :)
		//x = 1000_;
		x = 10______00; // po prostu tysiąc
		
		x = 0x0F_FF_80_00;
		x = 0b0011_0101;
		
		System.out.println(x); // 1000
		
		double dd = 10__00;
		dd = 3.14; // literał liczbowy z częścią ułamkową jest typu double (a nie float)
		dd = 1_00.0__0;
		//dd = 100._9;
		//dd = 100_.9;
		
		dd = 100.99d;
		//dd = 100.99_f;

		// NK x = 1L; // L na końcu oznacza typ long (może być duże lub małe)

		l = 1L;
		//NK l = 4_000_000_000;
		l = 4_000_000_000L;
		
		l = 1; // inta można wpisać na zmienną long

		System.out.println();
		
		float f = 12; // int na float - OK
		// f = 3.14;
		// literał z ułamkiem jest typu double, a double nie można wpisać na float
		f = 3.14F;
		f = 1.0f;
		f = 3f;
		f = 1.13e2F;
		System.out.println(f);

		double d = 3.14;
		// NK f = d;
		// na końcu double'a też można podać info o typie: D  albo d
		d = 4.44d;
		d = 4.445D;
		
		// liczba w notacji dziesiętnej razy 10 do podanej potęgi
		d = 1.25e3;
		System.out.println(d);
		d = 4.44e-3;
		System.out.println(d);
		System.out.println();
		
		// liczba w notacji szestastkowej razy 2 do podanej potęgi - tak to jest przechowywane wewnętrznie!
		d = 0x3p2; // 12
		System.out.println(d);
		d = 0x0.2p0; // 2/16 = 1/8 = 0.125 
		System.out.println(d);
		d = 0x1p-3;
		System.out.println(d);
	}
}
