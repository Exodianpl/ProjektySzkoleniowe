package gotowe.instrukcje;

public class Switch5 {
	
	static int ileDniMaMiesiac(String nazwa) {
		switch(nazwa) {
		case "styczeń" :
		case "marzec" :
		case "maj" :
		case "lipiec" :
		case "sierpień" :
		case "październik" :
		case "grudzień" :
			return 31;
		
		case "kwiecień":
		case "czerwiec":
		case "wrzesień":
		case "listopad":
			return 30;
			
		case "luty":
			return 28;

//		case null się nie skompiluje
//		case null:
//			return 0;
		
		default: return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(ileDniMaMiesiac("styczeń"));
		System.out.println(ileDniMaMiesiac("luty"));
		System.out.println(ileDniMaMiesiac("listopad"));
		System.out.println();
		
		// takie bajery nie działają:
		System.out.println(ileDniMaMiesiac("Lipiec"));
		System.out.println(ileDniMaMiesiac("*ec"));
		
		
		System.out.println(ileDniMaMiesiac(""));
		System.out.println(ileDniMaMiesiac(null)); // NPE

	}

}
