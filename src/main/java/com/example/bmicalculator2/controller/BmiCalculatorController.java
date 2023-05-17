package com.example.bmicalculator2.controller;



import com.example.bmicalculator2.service.BmiCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BmiCalculatorController {

    @Autowired
    private BmiCalculatorService bmiCalculatorService;

    @CrossOrigin
    @GetMapping("/calculateBmi")
    public ResponseEntity<Map<String, String>> calculateBmi(@RequestParam double weight, @RequestParam double height) {
        Map<String, String> result = bmiCalculatorService.calculate(weight, height);
        return ResponseEntity.ok(result);
    }
}