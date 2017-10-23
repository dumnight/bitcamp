// ## 키보드로부터 입력 받기 - 연습1
// - 다음과 같이 사용자로부터 구구단 번호를 입력 받아 출력하라!
// - 실행 예) 
// 구구단? 2
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// ...
// 2 * 9 = 18
// --------------------------
// 구구단? 10
// 2에서 9단까지만 가능합니다!
// 구구단? 1
// 2에서 9단까지만 가능합니다!
// 구구단? 0    <===== 0이하의 수를 입력하면 종료하라!
// 다음에 또 봐요!
// > 
package bitcamp.java100;

import java.io.Console;

public class Test21_5 {

    public static void main(String[] args) {
        // 입력한 학생 정보를 담을 메모리 설계

        // 콘솔 객체를 준비
        Console console = System.console();


        int dan;



        while(true) {
            dan = Integer.parseInt(console.readLine("구구단:"));


            if(dan >= 2 & dan <= 9) {
                for(int i = 1; i < 10; i++)
                    System.out.println(dan + "*" + i + "=" + dan * i + " ");
                    
            } else if(dan > 0) {
                System.out.println("2와 9사이 값을 입력");
                //throw new RuntimeException("구구단의 범위를 초과함");
            } else {
                System.out.println("종료");
                break;
            }    








        }
    }

}
