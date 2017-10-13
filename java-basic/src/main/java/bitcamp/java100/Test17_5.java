// 메서드 - 메서드 정의 문법
package bitcamp.java100;

    public class Test17_5 {
        
        // 4) 값을 반환하는 메서드 정의
        // 값을 반환하는 메서드는 선언문 앞에 반환하는 데이터의 타입을 지정해야 한다
        // 값을 반환하지 않을때는 void를 적는다
        // 예) int/String/void 메서드명(..) {...}
        
        // 메서드 안에서 값을 반환할 떄는 return 명령을 사용한다.
        // 예) return 값;
        
        //문자열을 반환하는 메서드
        static String m1() {
            return "Hello";
        }
        static int m2() {
            return 100;
        }
        static boolean m3() {
            return false;
        }
        
        // static int m4() { return "hello";} 오류
        // static int m5() {] 
        
        
        public static void main(String[] args) {
            
            // 값을 반환하는 메서드 호출하기
            String v = m1();
            System.out.println(v);
            
            //반환 받은 값을 변수에 저장하지 않고 바로 사용할 수 있다.
            System.out.println(m1());
            
            //반환 값을 다루지 않아도 된다
            m1();//반환 값을 저장하지 않으면 값은 버린다.
            
            
            //반환 값의 타입과 다른 메모리에 저장할 수 없다.
            //String s = m2();  리턴값은 int인데 String 변수에 저장하려 한다.
            
            
            
            
            
            
        }
    }  
