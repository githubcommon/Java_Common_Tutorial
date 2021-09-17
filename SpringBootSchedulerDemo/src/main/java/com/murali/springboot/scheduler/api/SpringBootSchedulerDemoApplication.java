package com.murali.springboot.scheduler.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 17, 2021 8:36:25 PM
 * @version:2.x
 */
@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulerDemoApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringBootSchedulerDemoApplication.class, args);
    }

}
