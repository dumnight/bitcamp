// 캡슐화 - 다른 패키지의 클래스가 멤버에 접근할 경우
package bitcamp.java100.ch08.ex1.other;

import bitcamp.java100.ch08.ex1.A;

public class Test2 {

    public static void main(String[] args) {
        
        //A.v1 = 100; private 접근불가
        //A.v2 = 200; // default 접근불가
        //A.v3 = 300; // protected 접근불가
        A.v4 = 400; // public
        
    }

}
