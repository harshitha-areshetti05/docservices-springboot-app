package com.example.docservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportsController {

    @GetMapping("/reports")
    public String reportsPage() {
        return "reports"; // returns reports.html template
    }
}
