package main.java.com.sjpark.board.menu;

import main.java.com.sjpark.board.post.PostService;

public class PostReadCommand implements Command {
    private final PostService postService;

    public PostReadCommand(PostService postService) {
        this.postService = postService;
    }

    @Override
    public void execute() {
        postService.readPosts();
    }
}