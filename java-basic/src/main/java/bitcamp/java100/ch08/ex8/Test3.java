//다형성 - 오버로딩 
//파라미터의 개수나 타입 순서가 다르더라도 같은 기능을 수행하는 메서드를
//같은 기능에 대해 같은 이름의 메서드를 사용하게 이관성을 제공한다
package bitcamp.java100.ch08.ex8;

public class Test3 {
    
    public static void main(String[] args) {
        
        B obj = new B();
        obj.m1(10);
        obj.m1(10f);
    }
}
