package com.sky.interactive.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentTestController {

    static final String ENVIRONMENT_CONF = "file.environment.conf";
    static final String LOG4J_CONF = "file.log4j.configuration";

    @RequestMapping("/")
    public String index() {
        String output = "";

        output+=ENVIRONMENT_CONF+"="+System.getProperty(ENVIRONMENT_CONF)+"\n\n";
        output+=LOG4J_CONF+"="+System.getProperty(LOG4J_CONF);

        return output;
    }
}
