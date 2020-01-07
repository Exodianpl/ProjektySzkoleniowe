package gotowe.operatory;

public class Leniwosc3 {
	public static void main(String[] args) {
		int x = 0, y = 0;
		
		if(x++ > 0 || y++ > 0) {
			System.out.println("prawda");
		} else {
			System.out.println("fałsz");
		}
		System.out.println("x == " + x);
		System.out.println("y == " + y);
		System.out.println();

		x = y = 0;
		if(++x > 0 || ++y > 0) {
			System.out.println("prawda");
		} else {
			System.out.println("fałsz");
		}
		System.out.println("x == " + x);
		System.out.println("y == " + y);

	}
	
}
