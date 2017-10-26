// 중첩 클래스(Nested Class = Inner Class)
package bitcamp.java100.ch08.ex1;

//다음 X1 클래스는 같은 파일에 있지만 엄연한 패키지 멤버 클래스이다
//중첩 클래스가 아니다
class X1 {}
//그래서 public 또는 default 접근만 가능

//protected class X2 {} //컴파일 오류
//private class X3 {} //컴파일 오류
public class Test6 {
    // 클래스 안에 선언된 클래스를 중첩 클래스라 부른다
    private class X4 {}
    class X5 {}
    protected class X6 {}
    public class X7 {}
    
    public static void main(String[] args) {
        
    }
}
