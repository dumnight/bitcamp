//## import - 클래스가 어떤 패키지에 있는지 컴파일러에게 알리는 방법

package bitcamp.java100;

import java.util.ArrayList;

// 이 명령은 컴파일 할떄 사용하고 컴파일이 끝나면 제거된다.
// 컴파일 할때 사용하고 끝나면 제거된다

public class Test19_2 {

    public static void main(String[] args) {
        
        // 현재 클래스가 소속되어 있는 패키지가 아닌
        // 다른 패키지에 소속되어 있는 클래스를 사용할 때는
        // 반드시 클래스 앞에 패키지를 적어줘야 한다
        
        ArrayList<String> list = new ArrayList<>(); // 컴파일 오류 
        list.add("홍길동");
        
        
        
    }
}


