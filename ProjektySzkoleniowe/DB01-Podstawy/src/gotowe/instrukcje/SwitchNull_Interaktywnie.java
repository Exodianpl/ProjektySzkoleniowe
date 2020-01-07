package gotowe.instrukcje;

import javax.swing.JOptionPane;

public class SwitchNull_Interaktywnie {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Wpisz napis");
		System.out.println("Jestem przed switchem, napis = " + s);
		switch(s) {
		}
		
		System.out.println("Jestem za switchem");
		// morał: przekazanie wartości null do switcha (na napisach lub na enumach)
		// skutkuje wyjątkiem NPE
		
		// wpisanie case null: wewnątrz switcha to jest z kolei błąd kompilacji
		
		switch(s) {
			case "Ala": System.out.println("Ala ma kota"); break;
			case "Ola": System.out.println("Ola ma psa"); break;
			//NK case null: System.out.println("NULL");
		}
	}

}
