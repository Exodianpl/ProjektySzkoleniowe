package gotowe.instrukcje;

import javax.swing.JOptionPane;

public class Switch4 {

    static String nazwaDniaTygodnia(int numer) {
        switch (numer) {
        case 1: return "poniedziałek";
        case 2: return "wtorek";
        case 3: return "środa";
        case 4: return "czwartek";
        case 5: return "piątek";
        case 6: return "sobota";
        case 7: return "niedziela";
        default:
            throw new IllegalArgumentException("Niepoprawny numer dnia tygodnia");
        }
    }

    public static void main(String[] args) {
        String tekst = JOptionPane.showInputDialog("Podaj numer dnia tygodnia");

        try {
            int numer = Integer.parseInt(tekst);
			String nazwa = nazwaDniaTygodnia(numer);
			System.out.println("Ten dzień to " + nazwa);
		} catch (Exception wylapanyWyjatek) {
			System.out.println("Wystąpił wyjątek " + wylapanyWyjatek);
		}
        
        System.out.println("Koniec programu");
    }

}
