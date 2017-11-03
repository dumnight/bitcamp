package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// 1단계 
// => "성적관리>" 프롬프트를 출력하여 사용자로부터 입력을 받는다.
public class App01 {
    static Scanner keyScan = new Scanner(System.in);
    static ArrayList<Score> list = new ArrayList<>();
    
    
    public static void main(String[] args) {
        loop:
        while (true) {
            System.out.print("성적관리> ");
            String input = keyScan.nextLine();
                    
            switch (input) {
            case "add": doAdd();break;
            case "list": doList(); break;
            case "view": doView(); break;
            case "update": doUpdate(); break;
            case "delete": doDelete(); break;
            case "quit": doQuit(); break loop;
            default: doErr();
                
            }
            System.out.println();
           
        }
        
       
    }
    private static void doErr() {
    	System.out.println("실행할 수 없는 명령입니다.");
	}
	private static void doQuit() {
    	System.out.println("프로그램을 종료합니다");
	}
	private static void doDelete() {
    	System.out.println("학생삭제");
        String name = prompt("이름: ");
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
        	if(confirm2("정말 삭제하시겠습니까?(y/N)")) {
        		list.remove(score);
        		System.out.println("삭제하였습니다");
        	} else {
        		System.out.println("삭제를 취소하였습니다");
        }
	}
	}
	private static void doUpdate() {
    	System.out.println("학생정보변경");
        String name = prompt("이름: ");
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
	private static void doView() {
    	System.out.println("학생정보");
        String name = prompt("이름: ");
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
	private static void doList() {
    	System.out.println("학생목록");
        Iterator<Score> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
	}
	private static void doAdd() {
    	System.out.println("학생등록");
        while(true) {
            Score score = new Score();
            score.input();
            list.add(score);
            if(!confirm("계속 하시겠습니까? Y/n")) {
                break;
            }
        }
	}
	static String prompt(String message) {
        System.out.print(message);
        return keyScan.nextLine();
    }
    
    static boolean confirm(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("y") || response.equals("yes") || response.equals("")) {
            return true;
        }
        return false;
    }
    static boolean confirm2(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("n") || response.equals("no") || response.equals("")) {
            return false;
        }
        return true;
    }
}





