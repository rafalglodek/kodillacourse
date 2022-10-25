package com.kodilla.patterns.tasks;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drive = factory.performTask(TaskFactory.DRIVINGTASK);
        //Then
        assertEquals("Drive", drive.getTaskName());
    }
    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paint = factory.performTask(TaskFactory.PAINTINGTASK);
        //Then
        assertEquals("paint", paint.getTaskName());
    }
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopp = factory.performTask(TaskFactory.SHOPPINGTASK);
        //Then
        assertEquals("shop", shopp.getTaskName());
    }
}
