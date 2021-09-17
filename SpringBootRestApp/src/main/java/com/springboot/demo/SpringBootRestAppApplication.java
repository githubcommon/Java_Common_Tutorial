package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.murali" })
public class SpringBootRestAppApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringBootRestAppApplication.class, args);
    }

}
