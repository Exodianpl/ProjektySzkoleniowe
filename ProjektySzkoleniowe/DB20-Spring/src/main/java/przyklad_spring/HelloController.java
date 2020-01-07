package przyklad_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    @GetMapping("/")
    public String index() {
   	 return "index";
    }
    
    @GetMapping("/hello")
    public String hello() {
   	 return "hello";
    }
    
    @GetMapping("/tajne")
    public String tajne() {
   	 return "tajne";
    }
    
    

}



