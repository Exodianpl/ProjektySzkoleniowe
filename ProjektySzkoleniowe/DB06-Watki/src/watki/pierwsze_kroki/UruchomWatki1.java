package watki.pierwsze_kroki;

public class UruchomWatki1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Poczatek main");
			Watek1_Extends watek1 = new Watek1_Extends();
			Watek2_Runnable watek2_Runnable = new Watek2_Runnable();
			Thread watek2 = new Thread(watek2_Runnable);
			
			watek1.start();
			watek2.start();
			
			System.out.println("Koniec main");
	}

}
