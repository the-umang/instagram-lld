package org.Instagram;


import Controller.InstagramController;
import Controller.UserController;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class InstagramMain {
    public static void main(String[] args) {
        InstagramController instagramController = new InstagramController();
        UserController userController = new UserController(instagramController);
        User user1 = userController.createUser(1,"AAAA");
        User user2 = userController.createUser(2,"BBBB");
        User user3 = userController.createUser(3,"CCCC");
        User user4 = userController.createUser(4,"DDDD");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        instagramController.createUserList(userList);
        userController.addFollower(1,2);
        userController.addFollower(1,3);
        userController.createPost(1, 1 ,"Hello everyone this is Umang Mundhara on instagram");
        userController.getAllFollower(1);
    }
}