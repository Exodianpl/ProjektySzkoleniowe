package przyklady;

import java.util.Scanner;

public class Silnia {
	
	
	static int silnia(int n) {
		int b = 1;
		for(int i = 1; i <= n ; i++) {
			
			b *= i;
		}
		
		return b;
	
		
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Podaj liczbę: ");
			
			int n = sc.nextInt();
			
			var wynik = silnia(n);
			
			System.out.println("Silnia dla Liczby " + n + " wynosi " + wynik);
		}
		
	}

}
