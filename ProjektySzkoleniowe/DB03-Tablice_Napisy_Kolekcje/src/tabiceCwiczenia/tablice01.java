package tabiceCwiczenia;

public class tablice01 {

	public static void main(String[] args) {
		int[] t = {10, 20, 30, 40, 50};
		
		System.out.println("Pętla for-each");
		
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		
		System.out.println();
		for (int x : t) {
			System.out.println(x);
			//x jest elementem tablicy
		}
	}
	
}
