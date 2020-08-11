package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FacadeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacadeApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(CalculatorFacade calculatorFacade) {
        return args -> {
            int a = 4;
            int b = 5;
            var calculator = CalculatorFactory.create();
            int response = calculator.add(a, b);
            System.err.println(response);

            response = calculator.add(a, b);
            System.err.println(response);
        };
    }
}
