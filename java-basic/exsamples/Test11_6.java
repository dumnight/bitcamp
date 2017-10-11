// # 자바에서 값 표현(literal)하기 - 정수의 크기

package bitcamp.java100;

public class Test11_6 {
    public static void main(String[] args){
        // 정수값의 기본은 4byte 크기를 갖는다.
        // -2**31 ~2**31 = -2147483648 ~ +2147483648
        System.out.println(-21_4748_3648);
        System.out.println(21_4748_3647);
        // 8byte 표현 : 숫자뒤에 l이나 L을 쓴다
        System.out.println(-21_4748_3649L); // 대문자 L을 주로씀
        System.out.println(21_4748_3648l);

        System.out.println(10);  // 4byte 정수 값
        System.out.println(10L); // 8byte 정수 값

        // 8바이트 크기의 가장 작은 정수값과 가장 큰 정수 값
        System.out.println(-922_3372_0368_5477_5808L);
        System.out.println(922_3372_0368_5477_5807L);
    }
}

// ## 비트 개수로 표현할 수 있는 최대 값
// 11 = 100 -1
// 2**1 + 2**0 = 2**2 - 1
// 공식: 2**(비트수) - = 그 비트로 표현 할 수 있는 최대 값
//                       음수까지 고려시 /2로 나누면 됨.