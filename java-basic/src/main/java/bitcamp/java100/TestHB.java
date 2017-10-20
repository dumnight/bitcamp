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
        String name;
        String email;
        String tel;
    }
    
    public static void main(String[] args) {
    
        prepareConsole(); 
        
        //값이 저장될 위치
        
        Set[] set = new Set[100];
        
        //값이 저장될 위치
        int cursor = 0;
        //배열의 개수만큼 입력을 받는다
        while(cursor < set.length) {
            Set sets = new Set();
            sets.name = console.readLine("이름 : ");
            sets.email = console.readLine("이메일 : ");
            sets.tel = console.readLine("전화 : ");
        String response = console.readLine("저장 하시겠습니까 (y/n)");
        if((response.toLowerCase().equals("y") || response.toLowerCase().equals("yes"))) {
            set[cursor] = sets;
            cursor++; 
        }
        response = console.readLine("계속 입력 하시겠습니까? (y/n)");
        if(!(response.toLowerCase().equals("y") || response.toLowerCase().equals("yes")))
            break;
        }
        
        //배열에 저장된 값을 출력한다.
        
        for(int i = 0; i < cursor; i++) {
        System.out.printf("%s, %s, %s\n", set[i].name, set[i].email, set[i].tel);
        
        }
    
    }
    
}
