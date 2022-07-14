package Model;

import lombok.Data;

import java.util.List;

@Data
public class Post {
    private int postID;
    private String content;

    //other metadata;
    //considering we don't need to worry about likes and comments for each posts

    public Post(int postID, String content) {
        this.postID = postID;
        this.content = content;
    }
}
