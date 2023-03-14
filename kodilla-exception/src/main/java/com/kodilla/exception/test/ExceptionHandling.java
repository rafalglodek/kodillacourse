package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2,1.5);
        } catch (SecondException e) {
            System.out.println("Problem while reading a file!");
    }

    }
}
