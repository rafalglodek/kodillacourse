package com.kodilla.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
    public class BoardTestSuite {

        @Test
        void testAdd() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
            Board board = context.getBean(Board.class);

            //When
            board.getDoneList().add("Drink caffe");
            board.getToDoList().add("Refactor company logger to meet our needs");
            board.getInProgressList().add("Optimize searching");

            //Then
            int size = board.getDoneList().tasks.size();
            int size2 = board.getToDoList().tasks.size();
            int size3 = board.getInProgressList().tasks.size();

            assertEquals(1, size);
            assertEquals(1, size2);
            assertEquals(1, size3);

        }

}
