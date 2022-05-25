package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionTestSuite {

    @BeforeEach
        public void before() {
            System.out.println("Test Case: begin");
        }

        @AfterEach
        public void after() {
            System.out.println("Test Case: end");
        }

        @BeforeAll
        public static void beforeAll() {
            System.out.println("Test Suite: begin");
        }

        @AfterAll
        public static void afterAll() {
            System.out.println("Test Suite: end");
        }

        @DisplayName("when ArrayList<Integer> numbers.size() equals 0 , " +
                "then evenNumbersList.size() should be equal 0"
        )

        @Test
        void testOddNumbersExterminatorEmptyList() {
            //Given
            List<Integer> numbers = new ArrayList<>();
            //numbers.add(0,1);
            //numbers.add(1,2);

            OddNumbersExterminator example = new OddNumbersExterminator();
            example.exterminate(numbers);

            //When
            List<Integer>  evenNumbersList = example.exterminate(numbers);
            Integer result = evenNumbersList.size();
            Integer resultTwo = numbers.size();
            // Or assert numbers.size() = 0;
            System.out.println("Testing " + result);
            //Then
            assertEquals(resultTwo, result);
        }

    @DisplayName("when ArrayList<Integer> numbers.size() > 0 , " +
            "then evenNumbersList should contain even numbers only"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0,1);
        numbers.add(1,2);
        numbers.add(2,3);
        numbers.add(3,4);
        numbers.add(4,5);
        numbers.add(5,6);

        OddNumbersExterminator example = new OddNumbersExterminator();
        example.exterminate(numbers);

        //When
        List<Integer>  evenNumbersList = example.exterminate(numbers);
        List<Integer> result = evenNumbersList;
        //System.out.println(result);
        System.out.println("Testing " + result);
        //Then
        assertEquals(Arrays.asList(2, 4, 6), result);
    }
}