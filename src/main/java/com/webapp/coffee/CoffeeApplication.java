package com.webapp.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class CoffeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoffeeApplication.class, args);
    }
}
