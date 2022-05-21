package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

 class OddNumbersExterminator {
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
            ArrayList<Integer> evenNumbersList = new ArrayList<>();
            ArrayList<Integer> numbers = new ArrayList<>();
            //When
            Integer result = evenNumbersList.size();
            System.out.println("Testing " + result);
            //Then
            Assertions.assertEquals(0, result);
        }
     @DisplayName("when ArrayList<Integer> numbers.size() > 0 , " +
             "then evenNumbersList.size() + oddNumbersList.size() equals numbers.size()"
     )

     @Test
     void testOddNumbersExterminatorNormalList() {
         //Given
         ArrayList<Integer> numbers = new ArrayList<>();
         ArrayList<Integer> evenNumbersList = new ArrayList<>();
         ArrayList<Integer> oddNumbersList = new ArrayList<>();
         //When
         Integer result = evenNumbersList.size()+oddNumbersList.size();
         System.out.println("Testing " + result);
         //Then
         Assertions.assertEquals(numbers.size(), result);
     }
}