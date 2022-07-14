package Service;

import Instagram.Instagram;
import Model.Post;
import Model.User;

import java.util.List;

public class PostServiceImpl implements PostServiceInterface{

    @Override
    public Post createPost(int postId,String content) {
        return new Post(postId,content);
    }
}
