package gotowe.zmienne;

public class ZasiegZmiennych {
	String zmienna = "globalna";
	
	void metoda1() {
		System.out.println(zmienna);
		if(zmienna.length() > 0) {
			System.out.println(zmienna);
			String zmienna = "lokalna";
			System.out.println(zmienna);
			
			if(zmienna.charAt(0) == 'l') {
				zmienna = "inna";
			}
			System.out.println(zmienna);
			innaMetoda();
			System.out.println(zmienna);
		}
		System.out.println(zmienna);
	}
	
	void innaMetoda() {
		System.out.println("innaMetoda: " + zmienna);
	}
	
	public static void main(String[] args) {
		new ZasiegZmiennych().metoda1();
	}
}
