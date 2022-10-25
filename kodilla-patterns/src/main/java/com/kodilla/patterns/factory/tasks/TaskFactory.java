package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task performTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Drive","to town","SUV");
            case PAINTINGTASK:
                return new PaintingTask("paint","white","room");
            case SHOPPINGTASK:
                return new ShoppingTask("shop","groceries",1);
            default:
                return null;
        }
    }
}