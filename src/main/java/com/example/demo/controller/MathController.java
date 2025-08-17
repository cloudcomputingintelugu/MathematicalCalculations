package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        int result = a + b;
        return "Addition Result: " + result;
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        int result = a - b;
        return "Subtraction Result: " + result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        int result = a * b;
        return "Multiplication Result: " + result;
    }
}
