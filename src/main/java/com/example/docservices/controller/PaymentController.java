package com.example.docservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @GetMapping("/payment")
    public String paymentPage() {
        return "payment"; // returns payment.html Thymeleaf template
    }
}
