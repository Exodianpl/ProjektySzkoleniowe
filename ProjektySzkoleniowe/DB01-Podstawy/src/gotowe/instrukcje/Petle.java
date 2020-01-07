package gotowe.instrukcje;

public class Petle {

	public static void petlaWhile() {
		int i = 1;
		while (i <= 5) {
			System.out.println("w pętli: " + i);
			i++;
		}
		System.out.println("za pętlą: " + i);
	}

	public static void doWhile() {
		int i = 1;
		do {
			System.out.println("w pętli: " + i);
			i++;
		} while (i <= 5);
		System.out.println("za pętlą: " + i);
	}

	public static void petlaFor() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("w pętli " + i);
		}

		// NK System.out.println("za pętlą: " + i);
		int i; // OK
	}


	public static void petlaFor2() {
		int i;

		for (i = 1; i <= 5; i++) {
			System.out.println("w pętli " + i);
		}

		System.out.println("za pętlą: " + i); // 6
		// NK int i;
	}

	// ominięte w main
	public static void petlaFor3() {
		// int i;

		for (int i = 1, j = 10; i <= 5 && j < 3; i++, j = i / 10, System.out.println("z pętli " + j)) {
			System.out.println("w pętli " + i);
		}

		// System.out.println("za pętlą: " + i);
	}

	// ominięte w main
	// w for moga byc dowolne instrukcje
	public static void petlaFor4(org.w3c.dom.Node node) {
		for (org.w3c.dom.Node child = node.getFirstChild(); child != null; child = child.getNextSibling()) {

			System.out.println(child.getTextContent());
		}
	}

	public static void losowanie() {
		for (;;) {
			double x = Math.random();
			System.out.println("Wylosowałem " + x);
			if (x > 0.8)
				break;
		}
		System.out.println("za pętlą");
	}

	public static void forEach() {
		String[] imiona = { "Ala", "Ola", "Ela", "Ula" };

		// tzw. "for-each" albo "enhanced for loop", od Javy 5
		for(String imie : imiona) {
			System.out.println("Kolejna osoba to " + imie);
		}		
	}
	
	public static void forEachEgzamin() {
		// typowa zmyłka z egzaminu
		int[] t = {1,2,3};
		for (int i : t) {
			// i oznacza WARTOŚĆ z tablicy, a nie indeks
			// więc tu dojdzie do wyjścia poza zakres tablicy
			System.out.println(t[i]);
		}
	}

	public static void przerwanie() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
			if (i % 2 == 1) {
				System.out.println("  nieparzysta, continue");
				continue;
			}
			System.out.println("  nie było continue");
			if (i % 3 == 0) {
				System.out.println("  podzielna przed 3, break");
				break;
			}
			System.out.println("  nie było break");
		}
		System.out.println("za pętlą");
	}

	public static int etykiety() {
		int suma = 0;
		duza:
		while(true) {
			for(int i = 1; i < 10; i++) {
				suma += i;
				if (suma > 100)
					break duza;
			}
		}
		return suma;
	}

	public static void main(String[] args) {
		etykieta:  // kompiluje się, ale nie ma jak tego użyć
		System.out.println("while");
		petlaWhile();
		
		//NK goto etykieta;

		System.out.println("\ndo-while");
		doWhile();

		System.out.println("\nfor");
		petlaFor2();

		System.out.println("\nLosowanie:");
		losowanie();

		System.out.println("\nfor-each");
		forEach();

		System.out.println();
		przerwanie();

		System.out.println();

		int x = etykiety();
		System.out.println(x);
	}
}
