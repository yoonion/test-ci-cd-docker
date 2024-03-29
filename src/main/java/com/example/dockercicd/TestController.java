package com.example.dockercicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    private static final String version = "v1.0.3";

    @GetMapping("/")
    public String home() {
        return "Hello CICD with Docker! version: " + version;
    }
}

