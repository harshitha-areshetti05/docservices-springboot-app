package com.example.docservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // root path
    public String homePage() {
        return "home"; // returns home.html template
    }
}
