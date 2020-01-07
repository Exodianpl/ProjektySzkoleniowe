package hello;

import javax.swing.JOptionPane;

public class Rozmowa {

	public static void main(String[] args) {

		String imie = JOptionPane.showInputDialog("Podaj imię");
		JOptionPane.showMessageDialog(null, "Witaj " + imie);

	}

}
