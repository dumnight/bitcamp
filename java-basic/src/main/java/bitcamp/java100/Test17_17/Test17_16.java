// 메서드 - 관련 메서드를 분류하기
// 메서드를 관리하기 쉽도록 서로 연관된 것끼리 묶어 분류하는 방법
package bitcamp.java100.Test17_17;

    public class Test17_16 {

        public static void main(String[] args) {
            // 별도의 클래스로 분류된 메서드 사용하기
            // 문법 : 클래스명.메서드명()
            
            Test17_16_a.m1();
            Test17_16_b.m1();
            Test17_16_a.m2();
            Test17_16_b.m2();
            Test17_16_a.m3();
            Test17_16_b.m3();
           
            Test17_16_b.m4();
            //다른 패키지에 있는 클래스를 사용할 때는 반드시 전체 패키지명까지 지정해야 한다.
            bitcamp.java100.Test17_17.Test17_16_c.m1();
            
        }
    }  

    // 클래스 문법의 용도
    // 1) 사용자 정의 데이터 타입을 만들 때 
    // 2) 메서드를 관리하기 쉽게 분류할 때