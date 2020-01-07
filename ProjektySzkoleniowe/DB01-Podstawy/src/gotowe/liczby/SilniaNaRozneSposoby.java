package gotowe.liczby;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SilniaNaRozneSposoby {
	
	static int silniaInt(int n) {
		int wynik = 1;
		for(int i = 2; i <= n; i++) {
			wynik *= i;
		}
		return wynik;
	}

	static long silniaFor(int n) {
		long wynik = 1;
		for(int i = 2; i <= n; i++) {
			wynik *= i;
		}
		return wynik;
	}

	static long silniaWhile(int n) {
		long wynik = 1;
		
		while(n > 1) {
			wynik *= n;
			n--;
		}
		
		return wynik;
	}
	
	static long silniaRek(int n) {
		// rekurencja
		
		if(n < 2) {
			return 1;
		} else {
			return n * silniaRek(n-1);
		}
	}
	
	static BigInteger silniaBig(int n) {
		BigInteger wynik = BigInteger.ONE;
		
		for(int i = 2; i <= n; i++) {
			wynik = wynik.multiply(BigInteger.valueOf(i));
		}
		
		return wynik;
	}
	
	static long silniaKontrolowana(int n) {
		long wynik = 1;
		for(int i = 2; i <= n; i++) {
			wynik = Math.multiplyExact(wynik, i);
		}
		return wynik;
	}
	
	static long silniaFun(int n) {
		// też OK return LongStream.rangeClosed(1, n).reduce(1, Math::multiplyExact );
		
		return LongStream.rangeClosed(1, n).reduce(1, (wynik, i) -> wynik * i);
	}
	
	static BigInteger silniaBigFun(int n) {
		return IntStream.rangeClosed(1, n)
			.mapToObj(BigInteger::valueOf)
			.reduce(BigInteger.ONE, BigInteger::multiply);
	}

	public static void main(String[] args) {
		
		System.out.println("int, for:");
		for(int arg = 0; arg <= 50; arg++) {
			System.out.println(arg + "! = " + silniaInt(arg));
		}
		System.out.println();

		System.out.println("long, for:");
		for(int arg = 0; arg <= 50; arg++) {
			System.out.println(arg + "! = " + silniaFor(arg));
		}
		System.out.println();

		System.out.println("long, while:");
		for(int arg = 0; arg <= 50; arg++) {
			System.out.println(arg + "! = " + silniaWhile(arg));
		}
		System.out.println();
	
		System.out.println("long, rekurencja:");
		for(int arg = 0; arg <= 50; arg++) {
			System.out.println(arg + "! = " + silniaRek(arg));
		}
		System.out.println();
	
		System.out.println("long, multiplyExact:");
		for(int arg = 0; arg <= 50; arg++) {
			try {
				System.out.println(arg + "! = " + silniaKontrolowana(arg));
			} catch(ArithmeticException e) {
				System.out.println("OVERFLOW");
			}
		}
		System.out.println();

		System.out.println("BigInteger, for:");
		for(int arg = 0; arg <= 100; arg++) {
			System.out.println(arg + "! = " + silniaBig(arg));
		}
		System.out.println();

				
		System.out.println("long, reduce:");
		for(int arg = 0; arg <= 50; arg++) {
			System.out.println(arg + "! = " + silniaFun(arg));
		}
		System.out.println();
	
		System.out.println("BigInteger, reduce:");
		for(int arg = 0; arg <= 100; arg++) {
			System.out.println(arg + "! = " + silniaBigFun(arg));
		}
		System.out.println();

	}

}

/* wersja w Pythonie:

def silnia(n):
    wynik = 1
    for i in range(1, n+1):
        wynik *= i
    return wynik

print(silnia(1))
print(silnia(5))
print(silnia(100))
*/

/* wersja w Haskellu:
silnia n = foldl (*) 1 [1..n]

silnia 5
silnia 100
*/

