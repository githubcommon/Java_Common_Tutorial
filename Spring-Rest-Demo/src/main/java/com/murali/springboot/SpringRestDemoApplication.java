package com.murali.springboot;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author:Sanapala Muralidharan
 * @date:Sep 17, 2021 12:17:04 PM
 * @version:2.x
 */
@SpringBootApplication
public class SpringRestDemoApplication {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void init() {
	repository.saveAll(Stream
		.of(new ApplicationUser(101, "Pratik", "p@gmail.com"),
			new ApplicationUser(102, "Dileep", "d@gmail.com"),
			new ApplicationUser(103, "Lav", "l@gmail.com"), new ApplicationUser(104, "Swat", "s@gmail.com"))
		.collect(Collectors.toList()));
    }

    public static void main(String[] args) {
	SpringApplication.run(SpringRestDemoApplication.class, args);
    }

}

// after running application enter this url in browser and connect to h2 database
//http://localhost:9090/h2-console/