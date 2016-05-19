package com.sky.interactive.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentTestController {

    static final String ENVIRONMENT_CONF = "FILE_ENVIRONMENT_CONF";
    static final String LOG4J_CONF = "FILE_LOG4J_CONFIGURATION";
    static final String PATH = "PATH";

    @RequestMapping("/")
    public String index() {
        String output = "";
        output+=ENVIRONMENT_CONF+"="+System.getenv(ENVIRONMENT_CONF)+"\n";
        output+=LOG4J_CONF+"="+System.getenv(LOG4J_CONF)+"\n";
        output+=PATH+"="+System.getenv(PATH);
        return output;
    }
}
