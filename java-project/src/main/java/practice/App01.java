package practice;

import java.util.Scanner;

// 1단계 
// => "성적관리>" 프롬프트를 출력하여 사용자로부터 입력을 받는다.
public class App01 {
	
	static Scanner keyScan = new Scanner(System.in);
	static ScoreController scoreController = new ScoreController();
	static MemberController memberController = new MemberController();
	static BoardController boardController = new BoardController();
    
    public static void main(String[] args) {
        loop:
        while (true) {
        	System.out.print("명령 > ");
        	String[] input = keyScan.nextLine().toLowerCase().split(" ");
        	
        	try {
        	switch(input[0]) {
        	case "menu": doMenu(); break;
        	case "help": doHelp(); break;
        	case "quit": doQuit(); break loop;
        	case "go" : doGo(input[1]); break;
        	default:
        		doErr();
        	}
        	} catch (Exception e) {
        		System.out.println("명령 처리중 오류 발생");
        	}
        	
//            
            System.out.println();
           
        }
        
       
    }
    private static void doGo(String menuNo) {
    	switch (menuNo) {
        case "1": scoreController.execute(); break;
        case "2": memberController.execute(); break;
        case "3": boardController.execute(); break;
        default:
            System.out.println("해당 번호의 메뉴가 없습니다.");
        }
	}
	
	private static void doHelp() {
    	System.out.println("도움말 출력");
    	System.out.println("menu         - 메뉴 목록을 출력한다");
    	System.out.println("go 번호      - 메뉴로 이동한다");
    	System.out.println("quit         - 프로그램을 종료한다");
	}
	private static void doMenu() {
    	System.out.println("메뉴출력");
    	System.out.println("1 성적관리");
    	System.out.println("1 회원관리");
    	System.out.println("1 게시판");
	}
	private static void doErr() {
    	System.out.println("실행할 수 없는 명령입니다.");
	}
	private static void doQuit() {
    	System.out.println("프로그램을 종료합니다");
	}
	
	
}





