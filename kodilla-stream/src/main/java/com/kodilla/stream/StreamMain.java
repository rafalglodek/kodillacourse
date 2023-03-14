package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

class StreamMain {

    public static void main(String[] args) {
        //PoemBeautifier poemBeautifier = new PoemBeautifier();

        //poemBeautifier.beautify("Rafal","<>*&^$%","",(a,b)->a+b+c);
        //poemBeautifier.beautify("a","b",(a,b)->a+b);
        //poemBeautifier.beautify("a","b",(a,b)->a+b);
        //poemBeautifier.beautify("a","b",(a,b)->a+b);

                Forum forum = new Forum();

                Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getTheForumUsersList().stream()
                        .filter(user -> user.getSex() == 'M')
                        .filter(user -> user.getBirthDay().getYear() < 2002)
                        .filter(user -> user.getNumberOfPosts() > 0)
                        .collect(Collectors.toMap(ForumUser::getUserId, forumUser ->forumUser ));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());

        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
    }
/*
    package com.kodilla.stream;

            import com.kodilla.stream.book.BookDirectory;

public class StreamMain {

    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
    }
}

 */