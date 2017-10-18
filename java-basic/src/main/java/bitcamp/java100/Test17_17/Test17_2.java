// 메서드 - 메서드 정의 문법
package bitcamp.java100.Test17_17;

    public class Test17_2 {
        
        //문법
        //리턴할_데이터의_타입 [메서드명] [파라미터, 파라미터,......] {명령어들}
        
        
        // 1)리턴 값과 파라미터가 없는 메서드
        // void -> 값을 리턴하지 않음을 표시
        // () -> 값을 받지 않는 경우 괄호() 안에 변수를 선언하지 않음
        static void m1() {
            System.out.println("m1() 메서드 실행됨");
        }
        
        public static void main(String[] args) {
            //메서드 호출법
            m1();
            
            //m1(100); 값을 받지 않은 메서드에 값을 주면 오류
            //int r = m1() 값을 리턴하지 않는 메서드에 값을 주면 오류
            
            
            
        }
    }  
