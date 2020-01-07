package gotowe.liczby;

import java.util.Scanner;

public class JakSprawdzicOverflow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę: ");
		int x = sc.nextInt();
		System.out.println("Podaj drugą liczbę: ");
		int y = sc.nextInt();
		
		int iloczyn = x * y;
		System.out.println("Wynik zwykłego mnożenia: " + iloczyn);

		try {
			int sprawdzony = Math.multiplyExact(x, y);
			System.out.println("Wynik zabezpieczonego mnożenia: " + sprawdzony);
		} catch (ArithmeticException e) {
			System.out.println("Overflow");
		}
	}

}
