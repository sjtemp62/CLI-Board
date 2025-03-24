package main.java.com.sjpark.board.menu;

import main.java.com.sjpark.board.post.PostService;

public class CreatePostCommand implements Command {
    private final PostService postService;

    public CreatePostCommand(PostService postService) {
        this.postService = postService;
    }

    @Override
    public void execute() {
        postService.createPost();
    }
}