// 메서드 - 메서드 정의 문법
package bitcamp.java100;

    public class Test17_6 {
        
        // 5) 여려 개의 값을 반환하는 방법
        // 자바는 없다
        // 해결책
        // 배열이나 객체에 담아서 반환한다.
        
        // 배열을 이용
        static int[] m1() {
            //배열을 초기화시키는 문법은 배열 레퍼런스 변수 선언문과 함께 사용해야 한다.
            int[] values = {100, 90, 80};
            //만약 레퍼런스변수를 먼저 선언한 다음에 초기화시키려면
            
            //반드시 명시적으로 new 명령을 작성해야 한다
            int[] values2;
            //values2 = {100, 90, 80}; x
            values2 = new int[] {100, 90, 80}; // o
            //return {100, 90, 80}; x
            return new int[] {100, 90, 80}; // o
            
            //리턴되는것은 배열의 주소가 리턴된다
            //primitive type(byte,short등)을 제외한 나머지 모든 타입은 무조건 값이 아닌 주소를 주고 받는 것이다
        }
        public static void main(String[] args) {
            
            int[] arr = m1();
            for(int i : arr) {
                System.out.println(i);
            }
            
            
            
        }
    }  
