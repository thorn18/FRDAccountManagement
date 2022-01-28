package com.RFDSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class RFDSpringApp {

    public static void main(String[] args) {
        SpringApplication.run(RFDSpringApp.class, args);
    }

}