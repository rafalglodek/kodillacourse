package com.kodilla.forum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {

    @Test
    void testGetUsername() {
        //Given

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.getUsername();
        System.out.println(name);

        //Then
        assertEquals("John Smith", name);

    }
}