// 캡슐화 - 같은 패키지의 클래스가 멤버에 접근할 경우
package bitcamp.java100.ch08.ex1;

public class Test1 {

    public static void main(String[] args) {
        
        //A.v1 = 100; private 접근불가
        A.v2 = 200; // default
        A.v3 = 300; // protected 서브클래스는 아니지만 같은 패키지의 클래스이다
        A.v4 = 400; // public
        
    }

}
