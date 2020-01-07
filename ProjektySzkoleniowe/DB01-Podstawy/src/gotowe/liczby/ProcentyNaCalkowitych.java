package gotowe.liczby;

public class ProcentyNaCalkowitych {

	public static void main(String[] args) {
			long netto = 10005;
			long procent = 23;
			long brutto = (netto * (100 + procent) + 50) / 100;
			System.out.println(brutto);

	}

}
