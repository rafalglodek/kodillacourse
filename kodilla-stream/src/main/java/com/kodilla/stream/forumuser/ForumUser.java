package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int userId;
    private final String name;
    private final char sex;
    private final LocalDate birthDay;
    private final int numberOfPosts;



    public ForumUser(int userId, String name, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.birthDay = LocalDate.of(yearOfBirth, monthOfBirth,dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId && sex == forumUser.sex && numberOfPosts == forumUser.numberOfPosts && name.equals(forumUser.name) && birthDay.equals(forumUser.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, sex, birthDay, numberOfPosts);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}