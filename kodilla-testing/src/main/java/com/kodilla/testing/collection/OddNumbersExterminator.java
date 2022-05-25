package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbersList = new ArrayList<>();
        int element = 0;
        for (int n = 0; n < numbers.size(); n++) {
            element = numbers.get(n);
            // checking if an element is even
            if (element % 2 == 0) {

                evenNumbersList.add(element);
                Integer size=evenNumbersList.size();
                //System.out.println(size);
            }
        }
        return evenNumbersList;
    }

}
