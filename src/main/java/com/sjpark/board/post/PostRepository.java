package main.java.com.sjpark.board.post;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    private final List<Post> posts = new ArrayList<>();
    
    public void save(Post post) {
        posts.add(post);
    }

    public List<Post> findAll() {
        return new ArrayList<>(posts);
    }
}
