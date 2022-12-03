package com.example.testlendo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan({"controller", "services", "configure"})
//@EntityScan("com.example.testlendo.dto")
//@EnableAutoConfiguration
//@Configuration
public class TestLendoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestLendoApplication.class, args);
    }

}
