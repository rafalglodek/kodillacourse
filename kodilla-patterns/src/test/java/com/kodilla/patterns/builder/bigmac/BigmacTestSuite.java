package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigmacTestSuite {

    @Test
    void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .bun("Bun")
                .burgers(2)
                .sauce("Spicy")
                .ingredient("Beef")
                .ingredient("Mushrooms")
                .ingredient("Tomatoes")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(4, howManyIngredients);
    }
}