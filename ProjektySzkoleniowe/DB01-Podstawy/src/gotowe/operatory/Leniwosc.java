package gotowe.operatory;

public class Leniwosc {
	private int x = 0, y = 0;
	
	public void gorliwa() {
		if(lewy() & prawy()) {
			System.out.println("prawda");
		} else {
			System.out.println("fałsz");
		}
		
		System.out.println("x == " + x);
		System.out.println("y == " + y);
	}

	public void leniwa() {
		// operator "leniwy"
		// jeśli lewa strona rozstrzyga o ostatecznym wyniku, to prawa strona nie jest sprawdzana
		if(lewy() && prawy()) {
			System.out.println("prawda");
		} else {
			System.out.println("fałsz");
		}
		
		System.out.println("x == " + x);
		System.out.println("y == " + y);
	}

	private boolean lewy() {
		x++;
		return false;
	}

	private boolean prawy() {
		y++;
		return true;
	}

	public static void main(String[] args) {
		System.out.println("wersja gorliwa");
		new Leniwosc().gorliwa();
		
		System.out.println("\nwersja leniwa:");
		new Leniwosc().leniwa();
	}
}
