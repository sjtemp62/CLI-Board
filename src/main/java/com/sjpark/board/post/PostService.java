package main.java.com.sjpark.board.post;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PostService {
    private final PostRepository postRepository = new PostRepository();
    private final Scanner scanner = new Scanner(System.in);

    // 게시글 작성
    public void createPost() {
        System.out.println("\n📌 게시글 작성");

        System.out.print("제목: ");
        String title = scanner.nextLine();

        System.out.print("내용: ");
        String content = scanner.nextLine();

        Post post = new Post(title, content);
        postRepository.save(post);

        System.out.println("✅ 게시글이 등록되었습니다.");
    }

    // 게시글 목록 조회
    public void viewPosts() {
        List<Post> posts = postRepository.findAll();

        if (posts.isEmpty()) {
            System.out.println("📭 등록된 게시글이 없습니다.");
            return;
        }

        System.out.println("\n📋 게시글 목록:");
        for (Post post : posts) {
            post.printSummary(); // 예: 1. 게시글 제목
        }
    }

    // Post Delete (based by postID)
    public void deletePost() {
        try {
            System.out.print("Please Enter Post ID: ");
            int postId = Integer.parseInt(scanner.nextLine());

            boolean success = postRepository.deletePost(postId);
            if (success) {
                System.out.println("Post has been successfully deleted.");
            } else {
                System.out.println("Post could not be deleted.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number");
        }
    }

    // Post Read (based by PostID)
    public void readPosts() {
        try {
            int postId = Integer.parseInt(scanner.nextLine());
            Optional<Post> result = postRepository.findById(postId);
            if (result.isPresent()) {
                Post post = result.get();
                post.printDetail();
            } else {
                System.out.println("Post could not be found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number");
        }
    }

}
