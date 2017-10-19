package bitcamp.java100;

import java.io.Console;

public class TestHB{
    
    static Console console;
    static void prepareConsole() {
        console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
    }
    
    static class Set{
        String names;
        String emails;
        String tels;
    }
    
    public static void main(String[] args) {
    
        prepareConsole(); 
        
        //값이 저장될 위치
        Set[] sets = new Set[100];
        
        //값이 저장될 위치
        int cursor = 0;
        //배열의 개수만큼 입력을 받는다
        while(cursor < sets.length) {
            Set set = new Set();
            set.names = console.readLine("이름 : ");
            set.emails = console.readLine("이메일 : ");
            set.tels = console.readLine("전화 : ");
            String response = console.readLine("저장하시겠습니까?(y/n)");

        if(response.toLowerCase().equals("y") || response.toLowerCase().equals("yes")) {
            sets[cursor] = set;
            cursor++; //증가시킬 값은 입력후에 위치하게 한다 
        }
            
        response = console.readLine("계속 입력 하시겠습니까?(y/n)");
        if(!(response.toLowerCase().equals("y") || response.toLowerCase().equals("yes"))) 
            // 입력한걸 소문자로 바꾼다음에 값과 비교
           break; 
        }
        //배열에 저장된 값을 출력한다.
        for(int i = 0; i < cursor; i++) {
        System.out.printf("%s, %s, %s\n", sets[i].names, sets[i].emails, sets[i].tels);
        }
    
    }
    
}
