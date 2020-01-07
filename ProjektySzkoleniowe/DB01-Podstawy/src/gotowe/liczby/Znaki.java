package gotowe.liczby;

public class Znaki {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A" + 5);

		System.out.println('A');
		System.out.println('A' + 5);
		System.out.println('A' + 'B');
		System.out.println();
		
		
		char c = 65; // można wpisywać konkretną wartość int, o ile mieści się w zakresie
		//NK char d = -1;
		
		int x = 65;
		int y = 'A';
		//NK c = x;  // ale nie int-a ze zmiennej
		c = (char)x;
		System.out.println(c);
		
		x = c;
		System.out.println(x);
		x = (int)c;
		System.out.println((int)c);
		System.out.println();
		
		for(char znak = 'A'; znak <= 'Z'; znak++) {
			System.out.print(znak + " ");
		}
		System.out.println();
		
		int ącki = 'Ą';
		System.out.println(ącki);
	}
}
