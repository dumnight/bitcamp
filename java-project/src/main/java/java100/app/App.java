//: ## ver 21
//: - 메뉴 기능을 추가하라!
//: - 요구사항 명세는 App.java 주석을 보라!
//: - 학습목표
//:   - 클래스 문법을 사용하여 관련 기능을 묶어서 분류하는 기법을 익한다.
//:   - 콘솔에서 사용자 입력을 다루는 방법을 연습한다.
//: 
//: 
//: 요구사항 
/*
명령> menu
1 성적관리
2 회원관리
3 게시판

명령> help
명령을 실행할 때는 'go 번호'를 입력하세요.
예를 들어 [성적관리] 메뉴를 실행하고 싶다면 'go 1'이라고 입력하세요.

명령> quit
프로그램을 종료합니다.

명령> ok
잘못된 명령입니다.

명령> go 1

성적관리> list
...

 */
package java100.app;

import java.util.HashMap;
import java.util.Scanner;

import java100.app.control.BoardController;
import java100.app.control.Controller;
import java100.app.control.GenericController;
import java100.app.control.MemberController;
import java100.app.control.RoomController;
import java100.app.control.ScoreController;
 
public class App {
    
    static Scanner keyScan = new Scanner(System.in);
    
    static HashMap<String, Controller> controllerMap = new HashMap<>();
    
    public static void main(String[] args) {
    	controllerMap.put("1",  new ScoreController());
    	controllerMap.put("2",  new MemberController());
    	controllerMap.put("3",  new BoardController());
    	
    	controllerMap.put("4",  new RoomController());
        
        loop2: 
        while(true) {
            System.out.print("명령> ");
            String[] input = keyScan.nextLine().toLowerCase().split(" ");
            try {
            switch(input[0]) {
            case "menu": doMenu(); break;
            case "go": doGo(input[1]); break;
            case "help": doHelp(); break;
            case "quit": doQuit(); break loop2;
            default: doErr();
                }
            } catch (Exception e) {
                System.out.println("명령 처리중 오류 발생");
                e.printStackTrace();
            }
        }
    }
    
    private static void doHelp() {
        System.out.println("[명령]");
        System.out.println("menu     - 메뉴 목록을 출력합니다");
        System.out.println("go 번호  - 메뉴로 이동한다");
        System.out.println("quit     - 프로그램을 종료합니다");
    }
    private static void doMenu() {
        System.out.println("1 성적관리");
        System.out.println("2 회원관리");
        System.out.println("3 게시판");
    }
    
    public static void doGo (String menuNo) {
    	
    	Controller controller = controllerMap.get(menuNo);
    	
    	if(controller == null) {
    		System.out.println("메뉴 번호가 잘못 되었습니다");
    		return;
    	}
    	controller.execute();
    }

    private static void doErr() {
        System.out.println("수행할 수 없는 명령입니다.");
    }
    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }
    
    
}




