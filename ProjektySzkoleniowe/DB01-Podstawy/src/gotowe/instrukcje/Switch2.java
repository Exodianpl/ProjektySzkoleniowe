package gotowe.instrukcje;

import javax.swing.JOptionPane;

public class Switch2 {

	public static void main(String[] args) {
		String tekst = JOptionPane.showInputDialog("Podaj numer dnia tygodnia");
		int numer = Integer.parseInt(tekst);
		
		switch (numer) {
		case 1:
			System.out.println("poniedziałek");
			break;
		case 2:
			System.out.println("wtorek");
			break;
		case 3:
			System.out.println("środa");
			break;
		case 4:
			System.out.println("czwartek");
			break;
		case 5:
			System.out.println("piątek");
			break;
		case 6:
			System.out.println("sobota");
			break;
		case 7:
			System.out.println("niedziela");
			break;
		default:
			System.out.println("niepoprawny numer dnia tygodnia");
		}

		System.out.println("Koniec programu");
	}

}
