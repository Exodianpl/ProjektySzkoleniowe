package hello;

import java.time.LocalTime;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Hello {
    
    public String sayHello(@WebParam(name="osoba") String imie) {
   	 return "Hello " + imie;
    }
    
    public String ktoraGodzina() {
   	 return "Teraz jest godzina " + LocalTime.now();
    }
    
    public String ulamek(
    		@WebParam(name="licznik") long licznik, 
    		@WebParam(name="mianownik") long mianownik) {
   	 return licznik+"/"+mianownik;
    }
    

}


