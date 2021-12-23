package com.murali.springboot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author:Sanapala Muralidharan
 * @date:Dec 23, 2021 12:46:23 PM
 * @version:2.x
 */
@Controller
public class Indexcontroller {

    private static final Logger logger = LogManager.getLogger(Indexcontroller.class);

    @GetMapping("/")
    public String index() {
	logger.info("info level message");
	logger.warn("warning level message");
	logger.error("error level message");
	return "index";
    }
}
