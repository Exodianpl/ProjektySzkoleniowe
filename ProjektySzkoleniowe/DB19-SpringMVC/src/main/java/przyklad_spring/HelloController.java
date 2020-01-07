package przyklad_spring;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(path="/hello")
    @ResponseBody
    public String hello() {
   	 return "Halo, tu Spring. Teraz jest godzina " + LocalTime.now();
    }
    
    // Dopiero od Spring 5 są dostepne adnotacje @GetMapping, @PostMapping itd.
    // wcześniej był dostępny tylko ogólny @RequestMapping
    @GetMapping("/dodaj")
    @ResponseBody
    public String dodaj(Long arg1, Long arg2) {
   	 // Tak zadeklarowane parametry uzyskają wartości przekazane w parametrach HTTP, liczą się nazwy parametrów
   	 // np. zadziała takie zapytanie
   	 // http://localhost:8080/dodaj?arg1=123&arg2=345
   	 
   	 if(arg1 != null && arg2 != null) {
   		 long wynik = arg1 + arg2;
   		 return "Wynik: " + wynik;
   	 } else {
   		 return "Podaj parametry";
   	 }
    }
    
    @GetMapping("/pomnoz")
    @ResponseBody
    public String pomnoz(
   		 @RequestParam("liczba1") Long arg1,
   		 @RequestParam("liczba2") Long arg2) {
   	 // http://localhost:8080/pomnoz?liczba1=123&liczba2=345
   	 
   	 if(arg1 != null && arg2 != null) {
   		 long wynik = arg1 + arg2;
   		 return "Wynik: " + wynik;
   	 } else {
   		 return "Podaj parametry";
   	 }
    }
    
    @GetMapping("/")
    public String powitanie() {
   	 // To, co zwracamy returem w metdzie kontrolera, (jeśli jest Striniem)
   	 // jest traktowane jak nazwa szablonu:
   	 // Upraszaczając - serwer wykona forward do tak wskazane zasobu - do klienta zostaje odesłany wynik jego działania.
   	 // Jeśli to zwykły HTML - to odsyłamy go jako jako treść odpowiedzi.
   	 return "powitanie.html";
    }
    
    @GetMapping("/rozmowa")
    public String rozmowaGet() {
   	 return "WEB-INF/rozmowa.jsp";
    }

    @PostMapping("/rozmowa")
    public String rozmowaPost(@RequestParam String imie, Model model) {
   	 model.addAttribute("powitanie", "Witaj " + imie + "!");
   	 return "WEB-INF/rozmowa.jsp";
    }
    
}



