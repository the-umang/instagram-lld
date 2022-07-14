package Controller;

import Model.Post;
import Service.PostServiceImpl;
import Service.PostServiceInterface;

public class PostController {
    private final PostServiceInterface postService;

    public PostController() {
        postService = new PostServiceImpl();
    }

    public Post createPost(int postId, String content){
        return postService.createPost(postId,content);
    }
}
