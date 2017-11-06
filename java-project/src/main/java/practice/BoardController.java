package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BoardController {
	private ArrayList<Board> list = new ArrayList<>();
	 static Scanner keyScan = new Scanner(System.in);
	 
	public void execute() {
		loop:
		while(true) {
			System.out.print("게시판> ");
		  	String input = keyScan.nextLine();
		          
		  		switch (input) {
				case "add": doAdd();break;
				case "list": doList(); break;
				case "view": doView(); break;
				case "update": doUpdate(); break;
				case "delete": doDelete(); break;
				case "main": break loop;
				default: 
					System.out.println("해당 명령이 없습니다");
	  		}
		}
	}
	public void doDelete() {
    	System.out.println("게시물 삭제");
        int no = Integer.parseInt(Prompts.prompt("이름: "));
        Board board = null;
        Iterator<Board> iterator = list.iterator();
        while(iterator.hasNext()){
            Board temp = iterator.next();
            if(temp.no == no) {
                board = temp;
            }
        }
        if(board == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", no);
        } else {
        	if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N)")) {
        		list.remove(board);
        		System.out.println("삭제하였습니다");
        	} else {
        		System.out.println("삭제를 취소하였습니다");
        }
	}
	}
	public void doUpdate() {
    	System.out.println("게시물 변경");
        int no = Integer.parseInt(Prompts.prompt("번호: "));
        Board board = null;
        Iterator<Board> iterator = list.iterator();
        while(iterator.hasNext()){
            Board temp = iterator.next();
            if(temp.no == no) {
                board = temp;
                break;
            }
        }
        if(board == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", no);
        } else {
            board.update();
        }
	}
	public void doView() {
    	System.out.println("게시물 상세 정보");
        int no = Integer.parseInt(Prompts.prompt("번호: "));
        
        Board board = null;
        Iterator<Board> iterator = list.iterator();
        while(iterator.hasNext()){
            Board temp = iterator.next();
            if(temp.no == no) {
                board = temp;
                break;
            }
        }
        if(board == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", no);
        } else {
            board.printDetail();
        }
	}
	public void doList() {
    	System.out.println("게시물 목록");
        Iterator<Board> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
	}
	public void doAdd() {
    	System.out.println("게시물 등록");
    	Board board = new Board();
    	board.input();
    	boolean isExist = false;
    	Iterator<Board> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().no == board.no) {
            	isExist = true;
            	break;
            }
        }
        if(isExist) {
        	System.out.println("이미 등록된 번호입니다");
        } else {
        	list.add(board);
        }
	}
}
