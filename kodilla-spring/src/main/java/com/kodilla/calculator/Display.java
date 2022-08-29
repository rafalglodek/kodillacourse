package com.kodilla.calculator;

import org.springframework.stereotype.Component;

import static java.lang.String.valueOf;

@Component
public class Display {
    public String displayValue(double val) {
        return valueOf(val);
    }

}
