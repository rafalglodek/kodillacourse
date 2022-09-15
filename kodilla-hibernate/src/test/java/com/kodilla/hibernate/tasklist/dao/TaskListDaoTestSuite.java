package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String TODOLIST = "ToDoList";

    @Test
    void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList(TODOLIST, "List with to do tasks");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        taskListDao.deleteById(id);
    }
    @Test
    void testTaskListDaoFindByListName() {
        //Given
        TaskList taskList = new TaskList(TODOLIST, "List with to do tasks");
        taskListDao.save(taskList);
        String description = taskList.getListName();

        //When
        List<TaskList> readTask = taskListDao.findByListName(description);

        //Then
        assertEquals(TODOLIST, readTask.get(0).getListName());

        //CleanUp
        int id = readTask.get(0).getId();
        taskListDao.deleteById(id);
    }

}
