package com.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagesController {
    @GetMapping("/user")
    public String Users(){
        return "Hello this is user page";
    }

    @GetMapping("/public")
    public String Public(){
        return "Hello this is public page";
    }

    @GetMapping("/admin")
    public String Admin(){
        return "Hello this is admin page";
    }
}
