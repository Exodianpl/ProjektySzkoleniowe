package gotowe.liczby;

public class Dzielenie {

	public static void main(String[] args) {
		double d = 1.25;
		
		int n = 5;
		
		// Uwaga na kolejność działań gdy miesza się inty i double
		// Tutaj: int dzielony porzez int - wynik obcinany do liczby całkowitej
		System.out.println(n / 3 * d);
		
		 // dzielenie na doublach
		System.out.println(n * d / 3);
		System.out.println(1.0 * n / 3 * d);
		System.out.println((double)n / 3 * d);
		System.out.println();
		
		System.out.println("Dzielenie całkowite i reszta z dzielenia:");
		for(int i = -10; i <= 10; i++) {
			System.out.printf("%3d / 3 = %2d      %3d %% 3 = %2d\n", i, i / 3, i, i % 3);
		}

	}

}
