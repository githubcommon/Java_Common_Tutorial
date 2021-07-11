package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author:Sanapala Muralidharan
 * @date:Jun 16, 2021 3:54:36 PM
 * @version:2.x
 */
@SpringBootApplication(scanBasePackages = { "com.murali" })
public class SpringBootProfileExampleApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringBootProfileExampleApplication.class, args);
    }

}

/*
 * Setting active profile When you run spring boot application, you need to set
 * active profile. There are multiple ways to set active profile.
 * 
 * By using -Dspring.profiles.active=dev in VM Arguments By using
 * spring.profiles.active=dev in application.properties
 * http://localhost:8080/welcome
 */