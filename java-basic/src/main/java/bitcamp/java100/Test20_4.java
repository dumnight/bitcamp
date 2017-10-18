//## Wrapper 클래스 사용법 - 메서드를 통해서 래퍼 객체 만들기
// new가 아닌 메서드를 통해 래퍼 객체를 만들어 보자

package bitcamp.java100;

public class Test20_4 {
    
    public static void main(String[] args) {
        //래퍼 클래스의 인스턴스를 만드는 기존 방식
        Integer i = new Integer(100);
        
        Integer i2 = Integer.valueOf(100);
        // valueOf처럼 객체를 생성해주는 메서드를 공장과 같다고 해서 factory method라 부른다
        
    }
}


