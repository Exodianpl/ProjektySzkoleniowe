package gotowe.liczby;

public class BityIBajty {

	public static void main(String[] args) {
		System.out.println("Zwiększanie bajta:");
		byte b = 0;
		for (int i = 1; i <= 260; i++) {
			String bity = Integer.toBinaryString(Byte.toUnsignedInt(b));
			bity = String.format("%8s", bity);
			bity = bity.replace(' ', '0');
			
			System.out.printf("%4d  :  %s%n", b, bity);
			b++;
		}
	}
}
