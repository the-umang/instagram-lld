package Service;

import Controller.PostController;
import Model.Post;
import Model.User;

import java.util.List;

public class UserServiceInterfaceImpl implements UserServiceInterface{
    @Override
    public User createUser(int userID,String userName) {
        User user = new User(userID,userName);
        System.out.println("User "+ user.getUserName() +" has been successfully created");
        return user;
    }

    @Override
    public void createPost(List<User> userList,int userId, int postId, String content) {
        for(User user:userList){
            if(user.getUserId() == userId){
                PostController postController = new PostController();
                Post post = postController.createPost(postId,content);
                user.appendPost(user,post);
            }
        }
    }

    @Override
    public void addFollower(List<User> userList,int userId, int followerId) {
        System.out.println("Adding followers initiated");
        for(User follower:userList){
            System.out.println("Follower name and id is "+ follower.getUserName() + "   " + follower.getUserId());
            if(follower.getUserId() == followerId){
                for(User user:userList){
                    System.out.println("User name and id is "+ follower.getUserName() + "   " + follower.getUserId());
                    if(user.getUserId() == userId){
                        user.addFollower(follower);
                    }
                }
            }
        }
    }

    @Override
    public void getAllFollower(List<User> userList, int userId) {
        for(User user:userList){
            if(user.getUserId() == userId) {
                for (User follower : user.getFollowers()) {
                    System.out.println("Followers is  " + follower.getUserName());
                }
            }
        }
    }
}
