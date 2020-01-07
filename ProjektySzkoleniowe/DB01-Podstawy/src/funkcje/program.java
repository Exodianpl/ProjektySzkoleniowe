package funkcje;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// sc.useLocale(Locale.US); <-- Scanner czyli metoda do przyjmowania wartości z konsoli, do ułamków urzyje . a nie , bo to zależy od języka systemu
		System.out.println("Podaj Liczbę: ");
		double liczba = sc.nextDouble();
		
		double kwadrat = FunkcjeGeometryczne.poleKwadratu(liczba);
		double kolo = FunkcjeGeometryczne.poleKola(liczba);
		
		System.out.println("Pole kwadratu o boku " + liczba + " wynosi " + kwadrat);		
		System.out.println("Pole koła o promieniu " + liczba + " wynosi " + kolo);
		
	}
	
}
