package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author:Sanapala Muralidharan
 * @date:Jun 16, 2021 3:04:58 PM
 * @version:2.x
 */
@SpringBootApplication(scanBasePackages = {"com.murali"})
public class SpringBootRestDemoApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringBootRestDemoApplication.class, args);
    }

}
