package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScoreController {
	private ArrayList<Score> list = new ArrayList<>();
	 static Scanner keyScan = new Scanner(System.in);
	 
	public void execute() {
		loop:
		while(true) {
			System.out.print("성적관리> ");
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
    	System.out.println("학생삭제");
        String name = Prompts.prompt("이름: ");
        Score score = null;
        Iterator<Score> iterator = list.iterator();
        while(iterator.hasNext()){
            Score temp = iterator.next();
            if(temp.name.equals(name)) {
                score = temp;
            }
        }
        if(score == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", name);
        } else {
        	if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N)")) {
        		list.remove(score);
        		System.out.println("삭제하였습니다");
        	} else {
        		System.out.println("삭제를 취소하였습니다");
        }
	}
	}
	public void doUpdate() {
    	System.out.println("학생정보변경");
        String name = Prompts.prompt("이름: ");
        Score score = null;
        Iterator<Score> iterator = list.iterator();
        while(iterator.hasNext()){
            Score temp = iterator.next();
            if(temp.name.equals(name)) {
                score = temp;
            }
        }
        if(score == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", name);
        } else {
            score.update();
        }
	}
	public void doView() {
    	System.out.println("학생정보");
        String name = Prompts.prompt("이름: ");
        Score score = null;
        Iterator<Score> iterator = list.iterator();
        while(iterator.hasNext()){
            Score temp = iterator.next();
            if(temp.name.equals(name)) {
                score = temp;
            }
        }
        if(score == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", name);
        } else {
            score.printDetail();
        }
	}
	public void doList() {
    	System.out.println("학생목록");
        Iterator<Score> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
	}
	public void doAdd() {
    	System.out.println("학생등록");
        while(true) {
            Score score = new Score();
            score.input();
            list.add(score);
            if(!Prompts.confirm("계속 하시겠습니까? Y/n")) {
                break;
            }
        }
	}
}
