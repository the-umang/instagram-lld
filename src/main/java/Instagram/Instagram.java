package Instagram;

import Controller.InstagramController;
import Model.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Instagram {
    private List<User> userList;

    public Instagram() {
        System.out.println("Inside Instagram constructor");
        userList = new ArrayList<>();
    }

    public List<User> getUserList() {
//        for (User user : this.userList) {
//            System.out.println(user.getUserName());
//        }
        return this.userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
//        for (User user : this.userList) {
//            System.out.println(user.getUserName());
//        }
    }
}
