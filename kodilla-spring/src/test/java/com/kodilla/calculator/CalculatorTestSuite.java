package com.kodilla.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Display display;

    @Test
    void testCalculationsAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        String sum = calculator.addAToB(1,2);
        String expected = "3.0";

        //Then
        assertEquals(expected,sum);
    }
    @Test
    void testCalculationsSubtract() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        String dif = calculator.subtractAFromB(2, 3);
        String expected = "1.0";

        //Then
        assertEquals(expected, dif);
    }
    @Test
    void testCalculationsMultiply() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        String product = calculator.multiplyAByB(2, 3);
        String expected = "6.0";

        //Then
        assertEquals(expected, product);
    }
    @Test
    void testCalculationsDivide() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        String quotient = calculator.divideAByB(2, 3);
        String expected = "1.5";

        //Then
        assertEquals(expected, quotient);
    }

}