package gotowe.operatory;

public class PlusPlus {

	public static void main(String[] args) {
		int x;
		int y;
		
		x = 10;
		y = ++x;
		System.out.println("++x    preinkrementacja");
		System.out.println("x: " + x + "    ,    y: " + y);
		System.out.println();

		
		x = 20;
		y = x++;
		System.out.println("x++    postinkrementacja");
		System.out.println("x: " + x + "    ,    y: " + y);
		System.out.println();
		
		x = 50;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println();
		
		Integer a = 100;
		a++;
		System.out.println(a); // a wskazuje już na inny obiekt
		System.out.println();
		
		double d = 0.5;
		System.out.println(d);
		d++; // można inkrementować też float i double
		System.out.println(d);
		System.out.println();
		
		x = 0x20;
		System.out.println(x);
		System.out.println(++x);
		
	}

}
