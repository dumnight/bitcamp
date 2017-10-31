//중첩 클래스
package bitcamp.java100.ch10.ex1;

public class Test2 {
    
    // static nested class
    static class A {}
    // non static nested class = inner class
    // 인스턴스가 있어야만 사용할 수 있는 클래스
    class B {}
    
    Object obj = new Object() {
        String name;
        public void m1() {}
    };
    public static void main(String[] args) {
        // local class
        // 특정 메서드에서만 사용하도록 메서드 안에 정의된 클래스ㄴ
        class C {}
        
        // 익명 클래스
        // 클래스에 이름이 없어 클래스를 정의하는 동시에 인스턴스를 바로 생성해야 하는 클래스
        Object obj2 = new Object() {
            String name;
            public void m1() {}
        };
        
        
    }
}
