package gotowe.instrukcje;

public class Label {
	public static void main(String[] args) {
		label1: System.out.println("Cokolwiek");
		label2:
		while(true) {
			double x = Math.random();
			if(x > 0.5)
				break label2;
		}
	
		// goto label1;
		// const int n = 10;
	}
}
