package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }
    int usersCount;
    int postsCount;
    int commentsCount;
    double postsByUsers;
    double commentsByUsers;
    double postsByComments;
    private Statistics statistics;

    void calculateAdvStatistics(Statistics statistics) {

        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        postsByComments = postsByComments();
        postsByUsers = postsByUsers();
        commentsByUsers = commentsByUsers();
    }
    private double commentsByUsers() {
        if (usersCount != 0) {

            return commentsCount / usersCount;
        }
        else {
            return 0;
        }
    }

    private double postsByComments() {
        if (commentsCount != 0) {

            return postsCount / commentsCount;
        }
        else {
                return 0;
            }
    }
    private double postsByUsers() {
        double i = 0;
        try {
            i = postsCount / usersCount;
        } catch (ArithmeticException e) {

        }
        return i;
    }


    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsByUsers() {
        return postsByUsers;
    }

    public double getCommentsByUsers() {
        return commentsByUsers;
    }

    public double getPostsByComments() {
        return postsByComments;
    }
}
