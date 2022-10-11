package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {

        OptionalDouble sth = IntStream.range(1, (numbers[20]))
                .average();

        return sth;

    }

}

