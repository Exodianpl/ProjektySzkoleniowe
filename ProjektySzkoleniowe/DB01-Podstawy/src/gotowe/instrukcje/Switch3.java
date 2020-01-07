package gotowe.instrukcje;

import java.util.Random;

import javax.swing.JOptionPane;

public class Switch3 {

	public static void main(String[] args) {
		String tekst = JOptionPane.showInputDialog("Podaj numer dnia tygodnia");
		int numer = Integer.parseInt(tekst);

		final int SOBOTA = 6; // stała
		// final int SOBOTA = new Random().nextInt(10);
		
		switch (numer) {
		case 3:
			System.out.println("środa");
			break;
		case 1:
			System.out.println("poniedziałek");
			break;
		case 2:
			System.out.println("wtorek");
			break;
		default:
			System.out.println("niepoprawny numer dnia tygodnia");
			break;
		case 4:
			System.out.println("czwartek");
			break;
		case 2+3:
			System.out.println("piątek");
			break;
		case SOBOTA:
			System.out.println("sobota");
			// tu nie ma break i wypisze się sobota niedziela
		case 7:
			System.out.println("niedziela");
		}

		System.out.println("Koniec programu");
	}

}
