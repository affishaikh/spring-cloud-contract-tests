package com.learnspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableAutoConfiguration
public class EvenOddController {

    @RequestMapping("/validate/prime-number")
    public String isNumberPrime(@RequestParam("number") Integer number, @RequestParam("word") String word) {
        System.out.println("---------------------------------------"+word+"-----------------------------------");
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        SpringApplication.run(EvenOddController.class, args);
    }
}
