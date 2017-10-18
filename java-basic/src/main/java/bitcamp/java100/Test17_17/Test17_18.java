//## 메서드 - 클래스 메서드와 인스턴스 메서드

package bitcamp.java100.Test17_17;

public class Test17_18 {
        
    static class My{
        int value;
        
        
        //클래스 메서드 - 클래스에 소속된 메서드
        //static이 붙은 메서드
        //인스턴스 값을 사용하려면 반드시 파라미터로 받아야 한다.
        
        static void print(My ref) {
            System.out.println(ref.value);
         // System.out.println(this.value); 컴파일 오류 
            
        }
    }
    
    public static void main(String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();
        
        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        //클래스 메서드르 통해 인스턴스 값을 다루려면 호출할 때 파라미터로 인스턴스 주소를 넘겨야 한다. 
        My.print(r1);
        My.print(r2);
        My.print(r3);
    }
}


