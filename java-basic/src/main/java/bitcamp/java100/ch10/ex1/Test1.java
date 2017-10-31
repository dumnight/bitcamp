//패키지 멤버 클래스 사용

package bitcamp.java100.ch10.ex1;

import bitcamp.java100.ch10.ex1.other.C;

public class Test1 {
    public static void main(String[] args) {
        A obj = new A();
        
        bitcamp.java100.ch10.ex1.other.B obj2 = new bitcamp.java100.ch10.ex1.other.B();
        
        C obj4 = new C();
        
        //bitcamp.java10.ch10.ex1.other.D obj5 = new bitcamp.java100.ch10.ex1.other.D();  
        //D 클래스는 공개 패키지 안에서만 사용되도록 비공개이기 때문에 다른 패키지에서 사용할 수 없다 
        
        E obj9 = new E();
        F obj6 = new F();
        G obj7 = new G();
        
    }
}
