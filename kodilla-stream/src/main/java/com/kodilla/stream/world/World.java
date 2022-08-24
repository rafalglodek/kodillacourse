package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class World {
    private final List<Continent> world = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
            return world.stream()
                    .flatMap(continent -> continent.getCountries().stream())
                    .map(Country::getPeopleQuantity)
                    .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        }
    }


