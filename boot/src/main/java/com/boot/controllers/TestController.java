package com.boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    
    @RequestMapping("")
    public String ping() {
        return "Welcome to Test Controller of Boot App";
    }

}
