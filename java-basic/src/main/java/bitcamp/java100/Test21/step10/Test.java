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

package bitcamp.java100.Test21.step10;

import java.io.Console;

import bitcamp.java100.Test21.ContactArray;
// 10단계 Contact 배열을 다루는 메서드를 별도의 클래스로 분류 
//  class 문법을 새 데이터 타입을 정의하는데 사용하는 전형적인 예
public class Test {
        //Contact 값을 저장할 레퍼런스 배열을 만든다
        
        static Console console;
        
        static void printContacts() {                 // 분리 1번째 순서
            //배열에 저장된 값을 출력한다.
            for(int i = 0; i < ContactArray.size(); i++) {         //8번째 cursor -> size
                Contact contact = ContactArray.get(i);
            System.out.printf("%s, %s, %s\n", contact.name, contact.email, contact.tel);
            } 
        }
        
        static boolean confirm(String message) {      // 분리 3번째 순서
            String input = console.readLine(message + "(y/n)");
            if(input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")) 
                // 입력한걸 소문자로 바꾼다음에 값과 비교
               return true;
            return false;
        }
        
        static Contact inputContact() {                 //분리 4번째 순서
            Contact contact = new Contact();
            //사용자가 입력한 데이터를 Contact인스턴스(객체)에 저장한다
            contact.name = console.readLine("이름 : ");
            contact.email = console.readLine("이메일 : ");
            contact.tel = console.readLine("전화 : ");
            
            return contact;

        }
        
        
        
        public static void main(String[] args) {
        
            console = System.console();
            if (console == null) {
                System.err.println("콘솔을 지원하지 않습니다.");
                System.exit(1);
            }
            //배열의 개수만큼 입력을 받는다
            while(true) {                                   //9번째
                Contact contact = inputContact();
                
                if(confirm("저장하시겠습니까?")) {
                //이름, 이메일, 전화 데이터가 들어있는 인스턴스 주소를 배열에 저장
                 try {                                    //10번째 2 예외처리
                     ContactArray.add(contact);
                 } catch (RuntimeException e) {
                     System.err.println("최대 저장 개수를 초과하였습니다.");
                     break;
                 }
            }
            if(!confirm("계속 입력하시겠습니까?"))
                break;
             
            }
        
        printContacts();
        
        }
        
    }









