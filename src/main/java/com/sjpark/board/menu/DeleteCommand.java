package main.java.com.sjpark.board.menu;

import main.java.com.sjpark.board.post.PostService;

public class DeleteCommand implements Command {
    private final PostService postService;

    public DeleteCommand(PostService postService) {
        this.postService = postService;
    }

    @Override
    public void execute() {
        postService.deletePost();
    }
}
