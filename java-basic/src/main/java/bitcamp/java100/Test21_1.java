//## 키보드로부터 입력받기
// Scanner 클래스 사용

package bitcamp.java100;

import java.util.Scanner;

public class Test21_1 {

    public static void main(String[] args) {
        // System.in
        // System 클래스에 선언된 레퍼런스이다
        // 표준 입력 장치인 '키보드' 정보가 들어있는 객체를 가리킨다. 그 객체의 주소를 갖고있다.
        
        // System.out
        // System 클래스에 선언된 레퍼런스이다
        // 표준 출력 장치 '콘솔' 또는 '명령창' 정보가 들어 있는 객체를 가리킨다. 그 객체의 주소를 갖고있다.
        
        Scanner keyScan = new Scanner(System.in);
        
        // nextLine() 입력된 내용을 한줄씩 잘라서 리턴한다.
        // 사용자가 한 줄 입력을 완료할 때까지 리턴하지 않는다.
        // 이런 것을 "blocking" I/O(input/output)라 부른다.
        // 이와 반대로 입력 작업을 시켜 놓고 즉시 리턴하는 것을 "non-blocking" I/O라 부른다 
        System.out.println("입력하세요:");
        String line = keyScan.nextLine();
        
        System.out.println(line);
        
        // 사용 완료 후 그 객체가 사용한 자원을 해제시킨다.
        // os에서 제공하는 자원 중에서 다른 프로그램이 사용할 수 있도록 묶어둔 자원을 풀어줘야 하는 경우가 있다.
        // 그런 객체는 보통 클래스에 close()라는 메서드를 갖고 있다.
        // 이런 클래스를 사용할 때는 사용후 close()를 반드시 호출하도록 하자
        // 단 즉시 JVM을 종료하는 경우 close()를 호출하지 않아도 된다.
        // JVM이 종료되면 VM에서 사용한 모든 자원은 OS가 강제 수거한다.
        
        keyScan.close();
        
        
    }
}


