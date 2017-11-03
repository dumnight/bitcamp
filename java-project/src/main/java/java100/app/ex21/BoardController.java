package java100.app.ex21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BoardController {
    private ArrayList<Board> list = new ArrayList<>();
    static Scanner keyScan = new Scanner(System.in);
    
    public void execute() {
        loop:
            while (true) {
                System.out.print("게시판 > ");
                String input = keyScan.nextLine();
                switch (input) { 
                case "list": this.doList(); break;           
                case "add": this.doAdd(); break; 
                case "view": this.doView(); break;
                case "update": this.doUpdate(); break;
                case "delete": this.doDelete(); break;
                case "main": break loop;
                default: 
                    System.out.println("수행할 수 없는 명령입니다");
                }
                System.out.println();
            }
    }
    private void doDelete() {
        int no = Integer.parseInt(Prompts.input("번호? "));
        Board board = null;
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board temp = iterator.next();
            if (temp.no == no) {
                board = temp;
                break;
            }
        }
        if (board == null) {
            System.out.printf("'%s'번 게시물이 없습니다.\n", no);
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(board);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
        
    }
    private void doUpdate() {
        int no = Integer.parseInt(Prompts.input("번호? "));
        Board board = null;
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board temp = iterator.next();
            if (temp.no == no) {
                board = temp;
                break;
            }
        }
        
        if (board == null) {
            System.out.printf("'%d'번 게시물이 없습니다.\n", no);
        }else {
            board.update();
        }
    }
    private void doView() {
        System.out.println("게시물 상세정보");
        int no = Integer.parseInt(Prompts.input("번호? "));
        
        Board board = null;
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board temp = iterator.next();
            if (temp.no == no) {
                board = temp;
                break;
            }
        }
        
        if (board == null) {
            System.out.printf("'%d'번 게시물이 없습니다.\n", no);
        } else {
            board.printDetail();
        }
        
    }
    private void doList() {
        System.out.println("[게시물 목록]");
        
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
        
    }
    private void doAdd() {
        System.out.println("게시물 등록");
        Board board = new Board(); 
        board.input();
        
        boolean isExist = false;
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().no == board.no) {
                isExist = true;
                break;
            }
        }
        if (isExist) {
            System.out.println("이미 등록된 번호 입니다.");
        } else {
            list.add(board);

        }
    }
        
        
    
}

