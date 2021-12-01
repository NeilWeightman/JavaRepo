package com.sparta.logging;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LoggingDemo {
    private static Logger logger = LogManager.getLogger("My Sparta App"); // LoggingDemo.getClass().getName()

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.warn("Warning msg");
    }
}
