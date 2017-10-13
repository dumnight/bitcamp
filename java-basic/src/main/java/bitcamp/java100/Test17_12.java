// 메서드 - 로컬 변수와 스택 메모리
package bitcamp.java100;

    public class Test17_12 {
        
        static void m1(int value) {
            value += 50;
            System.out.printf("m1(): %d\n", value);
        }
        
        public static void main(String[] args) {
            int value = 100;
            m1(value);
            System.out.printf("main(): %d" , value);
            
            //로컬 변수
            //메서드에 선언된 변수   
            //메서드가 호출될때 스택 메모리에 만들어진다
            //메서드 호출이 끝나면 제거된다
            //파라미터도 로컬 변수이기 때문에 동일하다
            
           
          
        }
    }  
