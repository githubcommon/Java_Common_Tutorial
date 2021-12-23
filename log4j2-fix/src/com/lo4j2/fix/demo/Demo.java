package com.lo4j2.fix.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author:Sanapala Muralidharan
 * @date:Dec 23, 2021 1:30:31 PM
 * @version:2.x
 */
public class Demo {

    private static Logger logger = LogManager.getLogger(Demo.class);

    public static void main(String[] args) {
	logger.debug("debug message");
	logger.info("info message");
	logger.error("error message");

    }

}
