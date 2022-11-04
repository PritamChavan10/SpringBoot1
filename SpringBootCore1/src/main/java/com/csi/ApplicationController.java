package com.csi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayhello(){
        return "WELCOME TO INDIA";
    }

    @GetMapping("/gg")
    public String sayBy(){
        return "Welcome to barca";
    }

    @GetMapping("/hh")
    public String bye(){
        return "Say bye to me";
    }

    @GetMapping("/bro")
    public String heyBro(){
        return "Hello Bro";
    }

    @GetMapping("/messi")
    public String messi(){
        return "Loe messi the goat";
    }

}
