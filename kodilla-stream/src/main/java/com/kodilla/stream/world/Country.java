package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
        BigDecimal PeopleQuantity;

        public Country(BigDecimal peopleQuantity) {

                PeopleQuantity = peopleQuantity;
        }

        public BigDecimal getPeopleQuantity() {
                return PeopleQuantity;
        }

}

