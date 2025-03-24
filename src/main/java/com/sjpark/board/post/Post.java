package main.java.com.sjpark.board.post;

public class Post {
    private static int idSeq = 1;

    private final int id;
    private final String title;
    private final String content;

    public Post(String title, String content) {
        this.id = idSeq++;
        this.title = title;
        this.content = content;
    }

    public void printSummary() {
        System.out.println(id + ". " + title);
    }

    public void printDetail() {
        System.out.println("번호: " + id);
        System.out.println("제목: " + title);
        System.out.println("내용: " + content);
    }

    public int getId() {
        return id;
    }
}