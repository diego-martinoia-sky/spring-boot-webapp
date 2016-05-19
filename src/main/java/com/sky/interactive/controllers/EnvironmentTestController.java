package com.sky.interactive.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentTestController {

    @RequestMapping("/")
    public String index() {
        String output = "";
        output+="file.environment.conf="+System.getenv("file.environment.conf")+"\n";
        output+="file.log4j.configuration"+System.getenv("file.log4j.configuration");
        return output;
    }
}
