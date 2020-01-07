package skaner;

import java.util.Scanner;

public class ProblemyZeSkanerem {

	
	public static int kalkulatorDzialanie(int liczba1, String znak, int liczba2) {
		int wynik = 0;
			switch (znak) {
			case "+": 
				return wynik = liczba1 + liczba2;
	
			case "-": 
				return wynik = liczba1 - liczba2;
	
			case "*": 
				return wynik = liczba1 * liczba2;
	
			case "/": 
				return wynik = liczba1 / liczba2;

			default:
				return wynik;		
			}
	}
	
	//------------------------------------------------------
	
	public static void kalkulator() {
		boolean wyjsc = true;
		while (wyjsc){
		Scanner sc = new Scanner(System.in);
		System.out.println("Wpisz działanie: ");
		int liczba1 = sc.nextInt();
		String znak = sc.next();
		int liczba2 = sc.nextInt();
		
	/*	System.out.println("Liczba: " + liczba1);
		System.out.println("Znak: " + 	znak);
		System.out.println("Liczba 2: " + liczba2);
	*/	
		int wynik = kalkulatorDzialanie(liczba1,znak,liczba2);

		System.out.println("Wynik: " + wynik);
		System.out.println("Aby zakończyć wpisz 0 aby dalej liczyc wpisz 1 : ");
		
			if (sc.nextInt() == 0) {
				wyjsc = false;
			}
		}
	}
	
	//---------------------------------
	
	public static void main(String[] args) {
		
		
		kalkulator();
		

	}
	
	
}
