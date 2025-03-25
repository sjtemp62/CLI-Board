package main.java.com.sjpark.board.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PostRepository {
    private final List<Post> posts = new ArrayList<>();

    public void save(Post post) {
        posts.add(post);
    }

    public List<Post> findAll() {
        return new ArrayList<>(posts);
    }

    // posts Delete Method
    public boolean deletePost(int id) {
        return posts.removeIf(post -> post.getId() == id);
    }

    public Optional<Post> findById(int id) {
        return posts.stream()
                .filter(post -> post.getId() == id)
                .findFirst();
    }
}
