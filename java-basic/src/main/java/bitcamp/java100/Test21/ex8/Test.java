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

package bitcamp.java100.Test21.ex8;

import java.io.Console;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        
        class Info {
            String name;
            String email;
            String phone;
           
        }
        ArrayList<Info> arr = new ArrayList<>();
        
        Console console = System.console();
        do { 
            Info i = new Info();
            i.name = console.readLine("이름? ");
            i.email = console.readLine("이메일? ");
            i.phone =console.readLine("전화? ");
            if (console.readLine("저장하시겠습니까? (y/n)").equals("y")) {
                System.out.println("저장하였습니다.");
                arr.add(i);     
            }
           
        } while( console.readLine("계속하시겠습니까? (y/n)").equals("y"));
        
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).name + "      " + arr.get(i).email + "  " + arr.get(i).phone);
        }
        

                
       
    }
}
     









