// ## 키보드로부터 입력 받기 - 연습4
// - 다음과 같이 사용자로부터 이름, 이메일, 전화를 입력받아 출력하시오!
// - 실행 예) 
// 이름? 홍길동
// 이메일? hong@test.com
// 전화? 1111-1111
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 임꺽정
// 이메일? leem@test.com
// 전화? 1111-1112
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 유관순
// 이메일? yoo@test.com
// 전화? 1111-1113
// 저장하시겠습니까?(y/n) n
// 저장 취소하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 안중근
// 이메일? ahn@test.com
// 전화? 1111-1114
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) n
// ------------------------------
// 홍길동     hong@test.com 1111-1111
// 임꺽정     leem@test.com 1111-1112
// 안중근      ahn@test.com 1111-1114
// > 

package bitcamp.java100.Test21.step2;

import java.io.Console;
// 2단계 배열을 사용하여 여러개의 값을 저장한다
public class Test {
        static Console console;
        static void prepareConsole() {
            console = System.console();
            if (console == null) {
                System.err.println("콘솔을 지원하지 않습니다.");
                System.exit(1);
            }
        }
        
        
        public static void main(String[] args) {
        
            prepareConsole(); 
            
            String[] names = new String[3];
            String[] emails = new String[3];
            String[] tels = new String[3];
            
            //값이 저장될 위치
            int cursor = 0;
            //배열의 개수만큼 입력을 받는다
            while(cursor < names.length) {
            names[cursor] = console.readLine("이름 : ");
            emails[cursor] = console.readLine("이메일 : ");
            tels[cursor] = console.readLine("전화 : ");
            cursor++; 
            }
            //배열에 저장된 값을 출력한다.
            cursor = 0;
            while (cursor < names.length) {
            System.out.println(names[cursor]);
            System.out.println(emails[cursor]);
            System.out.println(tels[cursor]);
            cursor++;
            }
        
        
        
        }
        
    }









