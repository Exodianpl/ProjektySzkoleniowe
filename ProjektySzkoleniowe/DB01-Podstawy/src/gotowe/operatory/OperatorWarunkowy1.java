package gotowe.operatory;

import javax.swing.JOptionPane;

public class OperatorWarunkowy1 {

	public static void main(String[] args) {
		int x = 10;

		String s = x > 10 ? "A" : "B";
		System.out.println(s);
		
		// różwnoważne:
		if(x > 10) {
			s = "A";
		} else {
			s = "B";
		}
		
		s = x > 10 ? JOptionPane.showInputDialog("podaj wartość") : "B";
		System.out.println(s);

		
		s = x > 10 ? "A" : x > 5 ? "B" : "C";
		System.out.println(s);
		s = x > 10 ? "A" : (x > 5 ? "B" : "C");
		System.out.println(s);

		s = x > 8 ? x < 20 ? "A" : "B" : " C";
		System.out.println(s);

		s = x > 8 ? (x < 20 ? "A" : "B") : " C";
		System.out.println(s);

		s = x > 8 ? x < 20 ? "A" : "B" : x % 2 == 0 ? "C" : " D";
		System.out.println(s);
		s = x > 8 ? (x < 20 ? "A" : "B") : (x % 2 == 0 ? "C" : " D");
	}
}
