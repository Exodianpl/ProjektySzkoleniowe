package gotowe.liczby;

public class IntegerOverflow {

	public static void main(String[] args) {
		System.out.println(2 * 1000_000_000);
		System.out.println(3 * 1000_000_000);
		System.out.println(3L * 1000_000_000);
		System.out.println();

        int x = 2147483646;

        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
	}
}
