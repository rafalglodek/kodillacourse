package com.kodilla.exception.test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTestSuit {
    @Test
    public void testProbablyIWillThrowException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(SecondException.class, () -> secondChallenge.probablyIWillThrowException(1,1.5)),
                () -> assertThrows(SecondException.class, () -> secondChallenge.probablyIWillThrowException(2,1.5))
        );
    }



}
