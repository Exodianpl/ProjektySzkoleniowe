package gotowe.instrukcje;

import javax.swing.JOptionPane;

public class Warunki {
	public static void main(String[] args) {
		String tekst = JOptionPane.showInputDialog("Podaj liczbę");
		int liczba = Integer.parseInt(tekst);

		if (liczba % 2 == 0) {
			System.out.println("Liczba jest parzysta");
		}
		// nie ma else

		if (liczba > 0) {
			System.out.println("Liczba dodatnia");
		} else {
			System.out.println("Liczba nie jest dodatnia");
			System.out.println("Czyli jest ujemna albo równa zero");
		}

		if (liczba > 1000) {
			System.out.println("Liczba bardzo duża");
		} else if (liczba > 100) {
			System.out.println("Liczba duża");
		} else if (liczba > 10) {
			System.out.println("Liczba mała");
		} else {
			System.out.println("Liczba bardzo mała");
		}

		// nie muszę pisać klamerek jeśli jest pojedyncza instrukcja
		if (liczba == 5)
			System.out.println("To jest pięć");
		else
			System.out.println("To nie jest pięć");
		System.out.println("i jeszcze to");

		// W Javie nie ma automatycznej konwersji liczb (ani innych rzeczy) na boolean
//		if(liczba) {
//			System.out.println("Nie zero");
//		}

		boolean logika = liczba > 100 && liczba % 3 == 0;
		if (logika) {
			System.out.println("Dziwny warunek jest prawdą");
		} else {
			System.out.println("Nieprawda");
		}
		
		if(logika = false) {
			System.out.println("Bzdura");  //nigdy się nie wypisze
		}
		System.out.println(logika); // zawsze będzie false, bo powyższy "if" tak naprawdę wpisuje wartośc false na zmienną, a nie sprawdza warunku
	}
}
