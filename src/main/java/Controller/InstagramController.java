package Controller;

import Model.User;
import Service.InstagramServiceImpl;
import Service.InstagramServiceInterface;

import java.util.List;

public class InstagramController {
    private final InstagramServiceInterface instagramService;

    public InstagramController() {
        this.instagramService = new InstagramServiceImpl();
    }

    public void createUserList(List<User> userList){
        instagramService.createUserList(userList);
    }

    public List<User> getAllUserList(){
        return instagramService.getAllUserList();
    }
}
