// ## 키보드로부터 입력 받기 - 연습2
// - 다음과 같이 사용자로부터 숫자를 입력 받아 각 숫자의 개수를 세시오.
// - 실행 예) 
// 숫자? 23347651
// 0 = 0
// 1 = 1
// 2 = 1
// 3 = 2
// 4 = 1
// 5 = 1
// 6 = 1
// 7 = 1
// 8 = 0
// 9 = 0
// > 

package bitcamp.java100;

import java.io.Console;

// 2단계 : 메서드 적용
public class Test21_6_2 {
    
static Console console;
    
    static void prepareInput() {
        console = System.console();
        
        if (console == null) {
            // 예외 상황을 만나면 호출자에게 알린다.
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
    }
    
    static StringBuffer inputNumber() {
        StringBuffer buf = new StringBuffer(console.readLine("숫자를 입력하세요:"));
        return buf;
    }

    static int[] countNumber(StringBuffer buf){
        int[] cnt = new int[10];
        for(int i = 0; i < buf.length(); i++) {
            cnt[buf.charAt(i) - '0']++;
            
        }
        return cnt;
    }
    
        
    static void printNumberCount(int[] cnt) {  
        for(int i = 0; i < cnt.length; i++) {
            System.out.printf("%d = %d\n", i, cnt[i]);
        }
        
    }

    public static void main(String[] args) {
        
       prepareInput();
       StringBuffer buf = inputNumber();
       int[] cnt = countNumber(buf);
       printNumberCount(cnt);
        
       
        
    }
}
