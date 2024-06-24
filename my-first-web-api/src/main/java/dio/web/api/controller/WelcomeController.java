package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Component Rest
public class WelcomeController {

    @GetMapping //Significa que este método é um recurso http do tipo get
    public String welcome(){
        return "Welcome to my Spring Boot Web API";
    }
}
