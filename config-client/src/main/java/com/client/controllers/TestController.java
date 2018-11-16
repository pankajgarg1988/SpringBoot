package com.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
@RefreshScope
public class TestController {

    @Value("${default.user}")
    private String user;
    
    @RequestMapping("ping")
    public String ping() {
        return "Hello " + user;
    }

}
