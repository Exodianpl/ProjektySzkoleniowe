package gotowe.zmienne;

public class PolaFinal {
	// pola które są final muszą być jawnie zainicjalizowane
	// albo w tym miejscu, albo w bloku inicjalizacyjnym, albo w konstruktorze
	final int numer;
	
	public PolaFinal() {
		numer = 0;
	}

	public PolaFinal(int nr) {
		numer = nr;
	}
}
