// # 자바에서 값 표현(literal)하기 - escape 문자 II

package bitcamp.java100;

public class Test11_3 {
    public static void main(String[] args){
        // 특정 명령을 수행하는 문자
        
        System.out.print("ABC");
        System.out.print('\b'); // Back space
        System.out.println("123");
        System.out.println("ABC\t123"); // Tab
        System.out.println("ABC\u0009123"); // Tab 의 유니코드 
        System.out.println("ABC\n123"); // Line Feed(LF - 0x000d) 줄바꿈
        System.out.println("ABC\r123"); // Carrage Return(CR - 0x000d) 커서를 처음으로 옮김
        System.out.println("ABC\f123"); // Form Feed : 명령의 위치에서 커서를 다음 줄로 이동
        System.out.println("ABC\"123"); // double quote 
        System.out.println("ABC'123"); // single quote 
        System.out.println('\''); // single quote 작은따옴표 안에 쓸때 \ 사용
        System.out.println('"');
        System.out.println("c:\\workspace\\test"); // backslash

    }
}