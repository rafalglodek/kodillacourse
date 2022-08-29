package com.kodilla.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public String addAToB(double a, double b) {
        return display.displayValue(a+b);
    }
    public String subtractAFromB(double a, double b) {
        return display.displayValue(b-a);
    }
    public String multiplyAByB(double a, double b) {
        return display.displayValue(b*a);
    }
    public String divideAByB(double a, double b) {
        return display.displayValue(b/a);
    }
}



