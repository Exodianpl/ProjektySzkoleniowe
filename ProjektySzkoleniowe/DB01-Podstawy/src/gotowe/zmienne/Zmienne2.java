package gotowe.zmienne;

// to raczej poza egzaminem
public class Zmienne2 {
	public static void main(String[] args) {
		final int x = 10; // kompilator potraktuje x jak stałą - "zinajluje"
		int y;
		if(x > 5) {
			y = 100;
		}
		// dzięki temu, że x jest final, teraz kompilaotr "wie", że y będzie zainicjalizownay
		System.out.println(y);
	}

}
