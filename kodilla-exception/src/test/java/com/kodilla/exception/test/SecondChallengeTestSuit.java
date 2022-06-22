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
                () -> assertThrows(SecondException.class, () -> secondChallenge.probablyIWillThrowException(3,3)),
                () -> assertThrows(SecondException.class, () -> secondChallenge.probablyIWillThrowException(2,3)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,3))
        );
    }
}
