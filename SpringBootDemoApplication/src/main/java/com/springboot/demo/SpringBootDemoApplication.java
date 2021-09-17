package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Sanapala Muralidharan
 * @date:Jun 16, 2021 1:38:31 PM
 * @version:2.x
 */
@RestController
@SpringBootApplication
public class SpringBootDemoApplication {
    @RequestMapping("/")
    String home() {
	return "Hello World Spring Boot!";
    }

    public static void main(String[] args) {
	SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
