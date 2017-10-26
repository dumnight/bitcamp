// 캡슐화 - 다른 패키지이지만 서브 클래스가 멤버에 접근할 경우
package bitcamp.java100.ch08.ex1.other;

import bitcamp.java100.ch08.ex1.A;

public class Test3 extends A {

    public static void main(String[] args) {
        
        //A.v1 = 100; private 접근불가
        //A.v2 = 200; // default 접근불가
        A.v3 = 300; // protected 
        A.v4 = 400; // public
        
    }

}
