package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();



    public Forum() {
        theForumUsersList.add(new ForumUser(56755, "Tom Smith", 'M', 1985, 02, 21, 0));
        theForumUsersList.add(new ForumUser(53215, "Rafal Smith", 'F', 2022, 03, 22, 8));
        theForumUsersList.add(new ForumUser(57299, "Meghan Smith", 'M', 1998, 04, 23, 0));
        theForumUsersList.add(new ForumUser(72994, "John Smith", 'F', 1975, 05, 24, 2));
        theForumUsersList.add(new ForumUser(90093, "Patric Smith", 'M', 1885, 06, 25, 0));
        theForumUsersList.add(new ForumUser(23443, "Barbara Smith", 'F', 1995, 07, 26, 3));
        theForumUsersList.add(new ForumUser(90097, "PerfectForumUser!!!", 'M', 1885, 06, 25, 20));

    }




    public List<ForumUser> getTheForumUsersList() {
        return theForumUsersList;
    }

}
