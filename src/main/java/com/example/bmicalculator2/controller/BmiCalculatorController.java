package com.example.bmicalculator2.controller;



import com.example.bmicalculator2.service.BmiCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BmiCalculatorController {

    @Autowired
    private BmiCalculatorService bmiCalculatorService;

    @GetMapping("/bmiForm")
    public String bmiForm() {
        return "bmiForm";
    }

    @PostMapping("/calculateBmi")
    public String calculateBmi(@RequestParam double weight, @RequestParam double height, Model model) {
        String bmiResult = bmiCalculatorService.calculate(weight, height);
        model.addAttribute("bmiResult", bmiResult);
        return "bmiResult";
    }
}