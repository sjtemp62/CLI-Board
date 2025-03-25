package main.java.com.sjpark.board.menu;

import main.java.com.sjpark.board.post.PostService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuService {
    private Map<Integer, Command> commands = new HashMap<>();

    public MenuService() {
        PostService postService = new PostService();

        commands.put(1, new CreatePostCommand(postService));
        commands.put(2, new ViewPostCommand(postService));
        commands.put(3, new DeleteCommand(postService));
        commands.put(4, new ExitCommand());
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n== 게시판 메뉴 ==");
            System.out.println("1. 게시글 작성");
            System.out.println("2. 게시글 목록 조회");
            System.out.println("3. 게시물 삭제");
            System.out.println("4. 종료");
            System.out.print("입력: ");

            int input = sc.nextInt();
            Command cmd = commands.get(input);
            if (cmd != null) cmd.execute();
            else System.out.println("올바른 메뉴 번호를 입력하세요.");
        }
    }
}
