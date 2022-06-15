package com.kodilla.testing.shape;

public class Circle implements Shape {

    public Circle(String shapeName, int field) {
        this.ShapeName = shapeName;
        this.Field = field;
    }

    public String ShapeName;
    public int Field;
    @Override
    public String getShapeName() {
        return ShapeName;
    }

    @Override
    public int getField() {
        return Field;
    }
}
