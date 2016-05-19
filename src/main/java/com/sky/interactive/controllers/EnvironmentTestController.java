package com.sky.interactive.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentTestController {

    static final String ENVIRONMENT_CONF = "file.environment.conf";
    static final String LOG4J_CONF = "file.log4j.configuration";
    static final String PATH = "PATH";

    @RequestMapping("/")
    public String index() {
        String output = "";
        output+=ENVIRONMENT_CONF+"="+System.getenv(ENVIRONMENT_CONF)+" "+System.getProperty(ENVIRONMENT_CONF)+"\n";
        output+=LOG4J_CONF+"="+System.getenv(LOG4J_CONF)+" "+System.getProperty(LOG4J_CONF)+"\n";
        output+=PATH+"="+System.getenv(PATH)+" "+System.getProperty(PATH);
        return output;
    }
}
