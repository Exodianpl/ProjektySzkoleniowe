package gotowe.instrukcje;

import javax.swing.JOptionPane;

public class Switch1 {

	public static void main(String[] args) {
		String tekst = JOptionPane.showInputDialog("Podaj numer dnia tygodnia");
		int numer = Integer.parseInt(tekst);
		
		switch (numer) {
		case 1:
			System.out.println("poniedziałek");
		case 2:
			System.out.println("wtorek");
		case 3:
			System.out.println("środa");
		case 4:
			System.out.println("czwartek");
		case 5:
			System.out.println("piątek");
		case 6:
			System.out.println("sobota");
		case 7:
			System.out.println("niedziela");
		default:
			System.out.println("niepoprawny numer dnia tygodnia");
		}

		System.out.println("Koniec programu");
	}

}
