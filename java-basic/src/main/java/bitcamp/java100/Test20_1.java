//## Wrapper 클래스 사용법

package bitcamp.java100;

public class Test20_1 {

    public static void main(String[] args) {
         
        // primitive type 변수
        int i = 10;
        
        // int wrapper 클래스 사용
        Integer i2 = new Integer(10);
        
        // wrapper 클래스
        // primitive 값을 객체로 다루기 위해 제공되는 클래스이다.
        // byte => java.lang.Byte
        // short => java.lang.short
        // int => java.lang.Integer
        // long => java.lang.Long
        // float => java.lang.Float
        // double => java.lang.Double
        // boolean => java.lang.Boolean
        // char => java.lang.Character
        
        // primitive 값을 객체로 다루는 이유
        // 클래스에서 제공하는 다양한 메서드를 이용할 수 있다
        // 좀 더 정교하게 값을 다룰 수 있다
        // 값이나 객체의 주소를 구분하지 않고 주고 받고 싶을 때 사용한다. 
        
        
        int i3 = i2.intValue();
        //객체에 저장된 int값을 float으로 만들어 리턴
        float f1 = i2.floatValue();
        
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        // 문자열을 해석하여 int로 변환
        int value = Integer.parseInt("2345");
        System.out.println(value + 100);
        // int 값을 2, 8, 16 진수로 표현된 문자열로 바꾸는 메서드도 있다.
        System.out.println(Integer.toBinaryString(44036));
        System.out.println(Integer.toOctalString(44036));
        System.out.println(Integer.toHexString(44036));
        
        
    }
}


