//## Wrapper 클래스 사용법 - 오토박싱 & 언박싱

package bitcamp.java100;

public class Test20_2 {

    public static void main(String[] args) {
        int i = 100;
        
        // 오토 박싱
        // primitive 값을 레퍼런스 변수에 저장하려 할때
        // 자동으로 래퍼 클래스의 인스턴스를 생성한 후 그 주소를 리턴한다.
        Integer r1 = 100; // -> new Integer(100)
        
        Integer r2 = new Integer(300);
        
        // 오토 언박싱
        // wrapper 객체를 primitive 타입의 변수를 저장하려 할 떄
        // 자동으로 래퍼 객체의 값을 꺼내는 것을 말한다.
        int i2 = r2; // -> r2.intValue()
        
    }
}


