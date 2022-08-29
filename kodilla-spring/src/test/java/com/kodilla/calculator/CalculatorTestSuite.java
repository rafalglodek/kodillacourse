package com.kodilla.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

@Autowired Calculator calculator;
    @Test
    void testCalculationsAdd() {


        //When
        String sum = calculator.addAToB(1,2);
        String expected = "3.0";

        //Then
        assertEquals(expected,sum);
    }
    @Test
    void testCalculationsSubtract() {
        //Given

        //When
        String dif = calculator.subtractAFromB(2, 3);
        String expected = "1.0";

        //Then
        assertEquals(expected, dif);
    }
    @Test
    void testCalculationsMultiply() {
        //Given

        //When
        String product = calculator.multiplyAByB(2, 3);
        String expected = "6.0";

        //Then
        assertEquals(expected, product);
    }
    @Test
    void testCalculationsDivide() {
        //Given

        //When
        String quotient = calculator.divideAByB(2, 3);
        String expected = "1.5";

        //Then
        assertEquals(expected, quotient);
    }

}