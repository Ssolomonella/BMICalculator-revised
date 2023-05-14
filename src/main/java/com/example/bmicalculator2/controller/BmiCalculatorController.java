package com.example.bmicalculator2.controller;


import com.example.bmicalculator2.service.BmiCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmiCalculatorController {

    @Autowired
    private BmiCalculatorService bmiCalculatorService;

    @GetMapping("/calculateBmi")
    public double calculateBmi(@RequestParam double weight, @RequestParam double height) {
        return bmiCalculatorService.calculate(weight, height);
    }
}