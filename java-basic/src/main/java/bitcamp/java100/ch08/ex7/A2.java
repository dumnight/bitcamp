//다형성 - 오버라이딩 문법 정리
package bitcamp.java100.ch08.ex7;

public class A2 extends A {
    public void test1() {
        m4();  //상속 받은 public 멤버 사용 가능
        m3();  //서브 클래스에서 상속 받은 protected 멤버 사용 가능
        m2();  // default
        //m1();  // private 멤버는 오직 그 클래스만 사용 가능 
    }
     
        //A클래스의 m1을 오버로딩하는게 아님
        private void m1() {
            System.out.println("B.m1()");
        }
    
        //수퍼클래스 A의 m2() 메서드를 오버라이딩 한다
        void m2() {
            super.m2();
        }
        
        protected void m3() {
            super.m3();
        }
        
        public void m4() {
            super.m4();
        }
    
}
