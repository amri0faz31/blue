package com.nebula.blue;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String greeting() {
        return "Greetings from Spring Boot!";
    }

}
