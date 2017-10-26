package bitcamp.java100.ch07.ex5;

public class C extends A {
    C(String msg) {
        
        super(100); // 파라미터의 값에 의해 해당 생성자를 호출
        System.out.println("C(String) 생성자 호출 -  " + msg);
    }
}
