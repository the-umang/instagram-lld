package Service;

import Instagram.Instagram;
import Model.User;

import java.util.List;

public interface InstagramServiceInterface {
    public void createUserList(List<User> userList);

    List<User> getAllUserList();
}
