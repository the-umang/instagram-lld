package Service;

import Instagram.Instagram;
import Model.User;

import java.util.List;

public class InstagramServiceImpl implements InstagramServiceInterface{
    Instagram instagram = new Instagram();
    @Override
    public void createUserList(List<User> userList){
        System.out.println("Creating user list");
        instagram.setUserList(userList);
    }

    @Override
    public List<User> getAllUserList() {
        System.out.println("Get all user list");
        return instagram.getUserList();
    }
}
