package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {


    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("7"));
        Country germany = new Country(new BigDecimal("5"));
        Country ukraine = new Country(new BigDecimal("8"));
        Country china = new Country(new BigDecimal("1"));
        Country japan = new Country(new BigDecimal("4"));
        Country canada = new Country(new BigDecimal("9"));
        Country mexico = new Country(new BigDecimal("4"));

        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(japan);

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(ukraine);

        Continent northAmerica = new Continent();
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(canada);

        List<Continent> world = new ArrayList<>();
        world.add(asia);
        world.add(europe);
        world.add(northAmerica);

        //When
        BigDecimal PeopleQuantity = world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPeople = new BigDecimal("38");
        assertEquals(expectedPeople, PeopleQuantity);
    }
}