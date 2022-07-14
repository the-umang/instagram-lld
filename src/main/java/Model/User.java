package Model;

import Observer.IObserver;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Data
public class User implements IObserver {
    private int userId;
    private String userName;
    private Queue<Post> posts;
    private Queue<Post> feeds;
    private List<User> followers;
    //other meta data;

    public User(int userID,String userName) {
        posts = new LinkedList<>();
        feeds = new LinkedList<>();
        followers = new ArrayList<>();
        this.userId = userID;
        this.userName = userName;
    }

    public void appendPost(User user, Post post) {
        this.posts.add(post);
        //Observer
        this.appendFeed(post);
    }

    @Override
    public void appendFeed(Post post) {
        for(User follower:this.followers){
            System.out.println("Follower named " + follower.userName + " of User " + this.userName + " got post " + post.getContent());
            follower.appendFeed(post);
        }
    }

    public void addFollower(User follower) {
        System.out.println("User " + this.userName + " have added " + follower.getUserName() + " follower");
        this.followers.add(follower);
    }
}
