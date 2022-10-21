package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetFileName() {
        //Given
        logger = Logger.INSTANCE;
        logger.log("ERROR");

        //When
        String lastLogName = logger.getLastLog();
        System.out.println("LogName: " + lastLogName);
        //Then
        assertEquals("ERROR", lastLogName);
    }

}