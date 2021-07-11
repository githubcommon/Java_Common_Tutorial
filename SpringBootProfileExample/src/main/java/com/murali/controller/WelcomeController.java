package com.murali.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Sanapala Muralidharan
 * @date:Jun 16, 2021 3:56:13 PM
 * @version:2.x
 */
@RestController
public class WelcomeController {
    @Value("${message}")
    String message;

    @GetMapping("/welcome")
    public String getMessage() {
	return "Hi " + message;
    }
}
