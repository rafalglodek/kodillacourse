package com.kodilla.shape;

import org.springframework.stereotype.Component;

@Component
public class Circle implements com.kodilla.spring.shape.Shape {

    @Override
    public String getShapeName() {
        return "This is a circle.";
    }
}