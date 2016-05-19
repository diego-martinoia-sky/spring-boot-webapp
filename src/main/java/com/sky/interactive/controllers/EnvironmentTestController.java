package com.sky.interactive.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentTestController {

    @RequestMapping("/")
    public String index() {
        String output = "";
        output+="FILE_ENVIRONMENT_CONF="+System.getenv("file.environment.conf")+"\n";
        output+="FILE_LOG4J_CONFIGURATION"+System.getenv("file.log4j.configuration");
        return output;
    }
}
