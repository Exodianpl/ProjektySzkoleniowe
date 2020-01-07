package gotowe.operatory;

public class OperatorWarunkowy3 {

	public static void main(String[] args) {
		// ilustracja zastosowań:
		String s = Math.random() > 0.5 ? "ala" : null;
		
		if(s != null && s.length() > 2) {
			System.out.println("ok");
		} else {
			System.out.println("puste");
		}

	}

}
