package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {


    @Test
    void testGetAverage1() {
        //Given
        int[] numbers = new int[21];
        {
            for (int i = 0; i < 21; i++)
                numbers[i] = i + 1;
        }
        //When
        IntStream.range(1, numbers.length)
                .forEach(System.out::println);

        OptionalDouble d3 = ArrayOperations.getAverage(numbers);
        if (d3.isPresent()) {
            System.out.println(d3.getAsDouble());
        } else {
            System.out.println("Nothing!");
        }

        //Then
        assertEquals(10.5, d3.getAsDouble());
    }

}
