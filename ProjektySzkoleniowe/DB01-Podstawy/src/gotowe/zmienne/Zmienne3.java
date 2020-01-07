package gotowe.zmienne;

public class Zmienne3 {
	static int statyczna;
	int instancyjna;

	public static void main(String[] args) {
		System.out.println(statyczna);
		//NK System.out.println(instancyjna); // nie ma dostepu do instancyjnych, bo jesteśmy w metodzie statycznej

		int lokalna;
		//NK System.out.println(lokalna); // niezainicjowana zmienna lokalna - nie wolno czytać
		//NK lokalna++;
		//NK lokalna += 4;
		
		lokalna = 50;
		System.out.println(lokalna); // OK

		//NK zwyklaMetoda(); // nie wolno wywołać metody instancyjnej, bo jesteśmy w metodze statycznej
		// aby wywołać muszę utworzyć obiekt i wywołać na konkretnym obiekcie
		Zmienne3 obiekt = new Zmienne3();
		obiekt.zwyklaMetoda();
		System.out.println(obiekt.instancyjna); // też OK, bo wskazuję konkretny obiekt
		
		// na egzaminie często piszą tak:
		new Zmienne3().zwyklaMetoda();
	}
	
	void zwyklaMetoda() {
		// metoda instancyjna
		System.out.println(statyczna);   // OK
		System.out.println(instancyjna); // OK
	}

}
