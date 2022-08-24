package com.kodilla.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    String username = "John Smith";

    public ForumUser() {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
14.1. bean ForumUser