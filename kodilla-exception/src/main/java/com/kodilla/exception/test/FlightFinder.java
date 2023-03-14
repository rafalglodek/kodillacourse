package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    void findFlight(Flight flight) throws RouteNotFoundException { //never thrown
        try {
            Flight parisLondon = new Flight("Paris", "London");
            Flight londonParis = new Flight("London", "Paris");
            Flight parisKrakow = new Flight("Paris", "Krakow");

            Map<Flight, Boolean> flights = new HashMap<>();
            flights.put(parisLondon, true);
            flights.put(londonParis, true);
            flights.put(parisKrakow, true);
            for (Map.Entry<Flight, Boolean> entry : flights.entrySet()) {

                if ((entry.getKey().getDepartureAirport().equals(flight.getDepartureAirport())) &&
                        (entry.getKey().getArrivalAirport().equals(flight.getArrivalAirport())) &&
                        (entry.getValue())) {
                    System.out.println("You can fly from " + entry.getKey().getDepartureAirport() + " to " + entry.getKey().getArrivalAirport());
                } else {
                    if ((!(entry.getKey().getDepartureAirport().equals(flight.getDepartureAirport())) ||
                            !(entry.getKey().getArrivalAirport().equals(flight.getArrivalAirport())) ||
                            (!entry.getValue()))) {
                        System.out.println("You can not fly to " + (flight.getArrivalAirport()));
                    }
                }
                throw new RouteNotFoundException();

            }
        } catch (RouteNotFoundException e) {  //empty catch
            System.out.println("Hello from catch");
        }
    }

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("London", "Paris"));

        } catch (Exception e) {  //empty catch
        }
    }
}