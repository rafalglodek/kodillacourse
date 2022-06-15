package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.List;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding and removing elements")
    class addingRemoving {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circleExample = new Circle("Circle", 45);

            //When
            shapeCollector.addFigure(circleExample);

            //Then
            List<Shape> shapeCollection = shapeCollector.addFigure(circleExample);
            int size = shapeCollection.size();
            String result = circleExample.getShapeName();
            Assertions.assertEquals("Circle", result);
        }

        @Test
        void removeFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circleExample = new Circle("Circle", 45);
            //Circle circleExample1 = new Circle("Circle",30);

            //When
            //shapeCollector.addFigure(circleExample);
            List<Shape> shapeCollection = shapeCollector.addFigure(circleExample);
            int size = shapeCollection.size();
            System.out.println(size);
            shapeCollector.removeFigure(circleExample);
            int result = shapeCollection.size();
            System.out.println(result);
            //int result = shapeCollection.size();


            //Then
            //String result = circleExample.getShapeName();
            Assertions.assertEquals(0, result);
        }
    }

    @Nested
    @DisplayName("Tests for getting and printing out elements")
    class gettingPrinting {
        @Test
        void getFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circleExample = new Circle("Circle", 45);
            Triangle triangleExample = new Triangle("Triangle", 30);
            Square squareExample = new Square("Square", 15);

            //When
            List<Shape> shapeCollection = shapeCollector.addFigure(circleExample); //index 0
            shapeCollector.addFigure(triangleExample);
            shapeCollector.addFigure(squareExample);                               //index 2

            //Then
            String result = shapeCollector.getFigure(0);
            Assertions.assertEquals("Circle", result);

            String result1 = shapeCollector.getFigure(2);
            Assertions.assertEquals("Square", result1);
        }

        @Test
        void showFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circleExample = new Circle("Circle", 45);
            Triangle triangleExample = new Triangle("Triangle", 30);
            Square squareExample = new Square("Square", 15);

            //When
            List<Shape> shapeCollection = shapeCollector.addFigure(circleExample);
            shapeCollector.addFigure(triangleExample);
            shapeCollector.addFigure(squareExample);

            //Then
            String r = shapeCollector.showFigures();

            System.out.println(r);
            Assertions.assertEquals("CircleTriangleSquare", r);
        }
    }
}