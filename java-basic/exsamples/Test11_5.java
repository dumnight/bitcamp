// # 자바에서 값 표현(literal)하기 - 정수의 자릿수 표현

package bitcamp.java100;

public class Test11_5 {
    public static void main(String[] args){
        // 10진수의 자릿수 표현 밑줄_ 을 이용하여 자릿수를 표현
        System.out.println(1456781234);
        System.out.println(14_5678_1234);
        System.out.println(1_456_781_234); // 위치는 상관없음

    
        //특히 숫자가 많은 2진수에 자릿수를 적용하면 편함
        System.out.println(0b0110_0100); // =100(2진수)
        System.out.println(0b0110_0100);
        System.out.println(0b110_0100);

    }
}