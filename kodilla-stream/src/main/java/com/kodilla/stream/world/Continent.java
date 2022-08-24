package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
        List<Country> countries = new ArrayList<>();


        public void addCountry(Country country) {
                countries.add(country);
        }

        public ArrayList<Country> getCountries() {

                return new ArrayList<>(countries);
        }
}


