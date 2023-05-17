package com.example.bmicalculator2.service;


import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class BmiCalculatorService {

    public Map<String, String> calculate(double weight, double height) {
        double bmi = weight / (height * height);

        String bmiCategory;
        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi < 24.9) {
            bmiCategory = "Normal weight";
        } else if (bmi < 29.9) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }

        Map<String, String> result = new HashMap<>();
        result.put("bmi", String.format("%.2f", bmi));
        result.put("category", bmiCategory);

        return result;
    }
}