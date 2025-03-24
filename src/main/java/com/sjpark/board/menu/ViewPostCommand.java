package main.java.com.sjpark.board.menu;

import main.java.com.sjpark.board.post.PostService;

public class ViewPostCommand implements Command {
    private final PostService postService;

    public ViewPostCommand(PostService postService) {
        this.postService = postService;
    }

    public void execute() {
        postService.viewPosts();
    }
}
