package main.java.com.sjpark.board.menu;

import main.java.com.sjpark.board.post.Post;
import main.java.com.sjpark.board.post.PostRepository;

public class CreatePostCommand implements Command {
    private final PostRepository postRepository;

    public CreatePostCommand(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void execute(Post post) {
        postRepository.save(post);
    }
}