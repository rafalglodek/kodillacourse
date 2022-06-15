package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<>();

    public List<Shape> addFigure(Shape shape) {

        shapeCollection.add(shape);

        return shapeCollection;
    }

    public void removeFigure(Shape shape) {

        shapeCollection.remove(shape);

    }

    public String getFigure(int n) {

        String shapeName = shapeCollection.get(n).getShapeName();

        return shapeName;
    }

    public String showFigures() {

        String r = "";
        for(int n=0; n<shapeCollection.size(); n++) {
            String result = shapeCollection.get(n).getShapeName();

            r = r + result;

        }
        return r;
    }

}
