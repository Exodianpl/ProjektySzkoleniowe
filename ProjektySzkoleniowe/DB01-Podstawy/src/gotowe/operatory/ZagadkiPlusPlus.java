package gotowe.operatory;

public class ZagadkiPlusPlus {

	public static void main(String[] args) {
		int x, y, z;

		x = 1;
		x = x++ + ++x;
		System.out.println(x);
		
		y = 1;
		y += y++;
		System.out.println(y);

		z = 1;
		z += z++ + ++z;
		System.out.println(z);
	}
}
