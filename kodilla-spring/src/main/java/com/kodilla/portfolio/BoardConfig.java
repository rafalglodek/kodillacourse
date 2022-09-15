package com.kodilla.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier ("toDoList")
    private TaskList toDoList;
    @Autowired
    @Qualifier ("inProgressList")
    private TaskList inProgressList;
    @Autowired
    @Qualifier ("doneList")
    private TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
    @Bean ("toDoList")
    @Scope ("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }
    @Bean ("inProgressList")
    @Scope ("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }
    @Bean ("doneList")
    @Scope ("prototype")
    public TaskList doneList() {
        return new TaskList();
    }
}
