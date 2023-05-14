package com.example.bmicalculator2.service;


import org.springframework.stereotype.Service;

@Service
public class BmiCalculatorService {

    public double calculate(double weight, double height) {
        // height is in meters and weight is in kg
        return weight / (height * height);
    }
}