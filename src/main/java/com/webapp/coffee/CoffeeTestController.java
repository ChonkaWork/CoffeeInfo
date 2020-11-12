package com.webapp.coffee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoffeeTestController {
    @GetMapping("/home")
    public ResponseEntity<String> getHello() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
