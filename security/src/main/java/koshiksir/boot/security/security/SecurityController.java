package koshiksir.boot.security.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityController {
    @GetMapping("/hi")
    @ResponseBody
    public String sayHi(){
        return "welcome";
    }
    
}
