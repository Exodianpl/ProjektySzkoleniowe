package gotowe.liczby;

public class PomylonyDouble {
	public static void zaszachraj(int n, double arg) {
		System.out.println("mnożenie : " + n * arg);

		double suma = 0.0;
		for (int i = 1; i <= n; i++) {
			suma += arg;
		}
		System.out.println("dodawanie: " + suma);
		System.out.println();
	}

	public static void main(String[] args) {
		zaszachraj(1000, 0.5); // 1/2
		zaszachraj(1000, 0.125); // 1/8

		zaszachraj(1000, 0.2); // 1/5 - nieskończone rozwinięcie w systemie dwójkowym
		zaszachraj(1000, 0.3);
		zaszachraj(1000, 1.0 / 3.0);
	}
}
