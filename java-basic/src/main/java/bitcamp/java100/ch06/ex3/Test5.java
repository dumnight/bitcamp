//스태틱 멤버  - 스태틱 멤버는 인스턴스 멤버를 사용 할 수 없다.
package bitcamp.java100.ch06.ex3;

public class Test5 {
        
        static int v1 = 100;
        static void m1() {
            System.out.println("m1()");
        }
        
        int v2 = 200;
        void m2() {
            System.out.println("m2()");
        }
        
        public static void main(String[] args) {
            //main() 메서드는 static으로 선언되어있다
            //따라서 스태틱 멤버이다
            //즉 Test5의 인스턴스를 생성하지 않아도 호출되는 메서드이다.
            
            System.out.println(v1);
            m1();
            
            //System.out.println(v2);
            //m2();
            
            //스태틱 멤버에서 인스턴스 멤버를 사용하려면 인스턴스주소가 필요하다
            Test5 obj1 = new Test5();
            
            obj1.v2 = 300;
            obj1.m2();
            
        }
        
}


