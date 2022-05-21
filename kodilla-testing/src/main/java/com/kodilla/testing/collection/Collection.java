package com.kodilla.testing.collection;

import java.util.ArrayList;

public class Collection {
    public static void main (String[] args) throws java.lang.Exception {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0,1);
        numbers.add(1,2);
        numbers.add(2,3);
        numbers.add(3,4);
        numbers.add(4,5);
        numbers.add(5,6);

OddNumbersExterminator klasa= new OddNumbersExterminator();
klasa.exterminate(numbers);
    }
}
