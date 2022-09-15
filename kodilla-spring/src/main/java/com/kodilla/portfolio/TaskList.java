package com.kodilla.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }


    public List<String> add(String task) {
        tasks.add(task);
        return tasks;
    }

}