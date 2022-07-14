package Controller;

import Model.User;
import Service.UserServiceInterface;
import Service.UserServiceInterfaceImpl;

import java.util.List;

public class UserController {
    private final UserServiceInterface userService;
    private final InstagramController instagramController;

    public UserController(InstagramController instagramController) {
        this.userService = new UserServiceInterfaceImpl();
        this.instagramController = instagramController;
    }

    public User createUser(int userID, String userName){
        return userService.createUser(userID,userName);
    }

    public void createPost(int userId,int postId,String content){
        List<User> userList = instagramController.getAllUserList();
        userService.createPost(userList,userId,postId,content);
    }

    public void addFollower(int userId,int followerId){
        List<User> userList = instagramController.getAllUserList();
        userService.addFollower(userList,userId,followerId);
    }

    public void getAllFollower(int userID){
        List<User> userList = instagramController.getAllUserList();
        userService.getAllFollower(userList,userID);
    }
}
