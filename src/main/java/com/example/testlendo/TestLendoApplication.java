package com.example.testlendo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
public class TestLendoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestLendoApplication.class, args);
    }

}
