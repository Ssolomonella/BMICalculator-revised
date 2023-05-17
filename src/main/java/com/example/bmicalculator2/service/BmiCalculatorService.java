package com.example.bmicalculator2.service;


import org.springframework.stereotype.Service;

@Service
public class BmiCalculatorService {

    public String calculate(double weight, double height) {
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

        return "Your BMI is " + bmi + ", which is considered " + bmiCategory + ".";
    }
}