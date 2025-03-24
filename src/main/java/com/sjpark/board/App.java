package main.java.com.sjpark.board;

import main.java.com.sjpark.board.menu.MenuService;

public class App {
    public static void main(String[] args) {
        MenuService menu = new MenuService();
        menu.start();  // 전체 흐름 제어는 이 한 줄이면 충분!
    }
}
