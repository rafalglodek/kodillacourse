package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;
    @Test
    void test0Posts() {
        // Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(0, forumStatistics.getPostsCount());
    }
    @Test
    void test1000Posts() {
        // Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(1000, forumStatistics.getPostsCount());
    }
    @Test
    void test0Comments() {
        // Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(0, forumStatistics.getCommentsCount());
    }
    @Test
    void testCommentsSmallerThanPosts() {
        // Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(0, forumStatistics.getCommentsCount(),0.001);
        assertEquals(1000, forumStatistics.getPostsCount(),0.001);
        assertEquals(0, forumStatistics.getPostsByComments(),0.001);

        System.out.println(forumStatistics.getPostsByComments());

    }
    @Test
    void testCommentsSmallerThanPosts1() {
        // Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(1000);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(100, forumStatistics.getPostsByComments(),0.001);
        System.out.println(forumStatistics.getPostsByComments());

    }
    @Test
    void testCommentsBiggerThanPosts() {
        // Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(10);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double div = forumStatistics.getPostsByComments();
        // Then
        assertEquals(0.00001, div,0.001);
        assertEquals(0, forumStatistics.getUsersCount(),0.001);
        System.out.println(div);
    }
    @Test
    void testZeroUsers() {
        List<String> usersList = new ArrayList<>();
        // Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(0, forumStatistics.getUsersCount(),0.001);
        assertEquals(0, forumStatistics.getCommentsByUsers(),0.001);
        assertEquals(0, forumStatistics.getPostsByUsers(),0.001);
        double div = forumStatistics.getPostsByUsers();
        System.out.println(div);

    }
    @Test
    void testHundredUsers() {
        List<String> usersList1 = new ArrayList<>();
        for(int i=0; i<100; i++) {
            usersList1.add("ForumUser");
        }
        // Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersList1);
        when(statisticsMock.postsCount()).thenReturn(1000);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(100, forumStatistics.getUsersCount(),0.001);
        assertEquals(0, forumStatistics.getCommentsByUsers(),0.001);
        assertEquals(10, forumStatistics.getPostsByUsers(),0.001);
    }
}