package org.softspiders.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    final private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("main BEGIN");
        SpringApplication.run(Application.class, args);
        logger.info("main END");
    }
}

@RestController
class Controller {
    final private static Logger logger = LoggerFactory.getLogger(Controller.class);
    @GetMapping("/hello")
    public String hello() {
        logger.info("hello BEGIN");
        String result = "Hello, World!";
        logger.info("hello END: result = " + result);
        return result;
    }
}
