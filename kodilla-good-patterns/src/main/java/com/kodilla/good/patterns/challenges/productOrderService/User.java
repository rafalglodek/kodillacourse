package com.kodilla.good.patterns.challenges.productOrderService;

public class User {
    String Name;
    String Surname;

    public User(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }
}
