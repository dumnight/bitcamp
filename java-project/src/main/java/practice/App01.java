package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// 1단계 
// => "성적관리>" 프롬프트를 출력하여 사용자로부터 입력을 받는다.
public class App01 {
    static Scanner keyScan = new Scanner(System.in);
    
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
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        ArrayList<Score> list = new ArrayList<>();
        Iterator<Score> iterator;
        
        loop:
        while (true) {
            System.out.print("성적관리> ");
            String input = keyScan.nextLine();
            String name = null;
            Score score = null;
                    
            switch (input) {
            case "add":
                System.out.println("학생등록");
                while(true) {
                    score = new Score();
                    score.input();
                    list.add(score);
                    if(!confirm("계속 하시겠습니까? Y/n")) {
                        break;
                    }
                }
                break;
            case "list":
                System.out.println("학생목록");
                iterator = list.iterator();
                while(iterator.hasNext()) {
                    iterator.next().print();
                }
                break;
            case "view":
                System.out.println("학생정보");
                name = prompt("이름: ");
                score = null;
                iterator = list.iterator();
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
                break;
                
            case "update":
                System.out.println("학생정보변경");
                name = prompt("이름: ");
                score = null;
                iterator = list.iterator();
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
                break;
            case "delete":
                System.out.println("학생삭제");
                break;
            case "quit":
                System.out.println("프로그램을 종료합니다");
                break loop;
            default:
                System.out.println("실행할 수 없는 명령입니다.");
            }
            
           
        }
        
       
    }
}





