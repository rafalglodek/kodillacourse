package com.kodilla.shape;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements com.kodilla.spring.shape.Shape {

    @Override
    public String getShapeName() {
        return "This is a triangle.";
    }
}