package org.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    @GetMapping(value="/ka")
    public String getString(){
        return "kalyan ram is gperson";
    }
}