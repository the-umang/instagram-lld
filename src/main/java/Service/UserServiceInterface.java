package Service;

import Model.User;

import java.util.List;

public interface UserServiceInterface {
    public User createUser(int userID,String userName);

    public void createPost(List<User> userList,int userId, int postId, String content);

    public void addFollower(List<User> userList,int userId, int followerId);

    void getAllFollower(List<User> userList, int userId);
}
