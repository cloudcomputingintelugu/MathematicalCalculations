package com.example.mathwarapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "Result: " + (a + b);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        return "Result: " + (a - b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        return "Result: " + (a * b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return "Error: Cannot divide by zero";
        }
        return "Result: " + (a / b);
    }
}

