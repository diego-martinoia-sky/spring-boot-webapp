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

        output+=ENVIRONMENT_CONF+"="+System.getProperty(ENVIRONMENT_CONF)+"\n\n";
        output+=LOG4J_CONF+"="+System.getProperty(LOG4J_CONF);

        output+="ENV:\n";
        for(String s: System.getenv().keySet()) {
            output+=s+" = "+System.getenv(s)+"\n";
        }

        output+="\n\n\n";

        output+="SYS:\n";
        for(String s: System.getProperties().stringPropertyNames()) {
            output+=s+" = "+System.getProperty(s)+"\n";
        }

        return output;
    }
}
