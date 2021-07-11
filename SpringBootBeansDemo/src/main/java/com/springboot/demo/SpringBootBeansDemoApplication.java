package com.springboot.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

/**
 * @author:Sanapala Muralidharan
 * @date:Jun 16, 2021 2:55:14 PM
 * @version:2.x
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringBootBeansDemoApplication {

    public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringBootBeansDemoApplication.class, args);
	String[] beanNames = ctx.getBeanDefinitionNames();

	Arrays.sort(beanNames);

	for (String beanName : beanNames) {
	    System.out.println(beanName);
	}
    }

}
