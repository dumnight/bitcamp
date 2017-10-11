// # printf 사용법
package bitcamp.java100;



public class Test10_4 {
    public static void main(String[] args){
        //[argument_index$][flags][width][.precision]conversion
        System.out.printf("%4$2s, %3$2s, %2$2s, %1$2s\n", "a", "b", "c", "d");
       
        //conversion 사용법
        /* %s,%S : 문자열
           %d : 10진수
           %o : 8진수
           %x,%X : 16진수
           %h,%H : Integer.toHexString(arg.hashCode())의 리턴 값.
           %f : 부동소수점
           %t,%T : Date/Time 값 %ty&Y 소문자일경우 2자리 대문자일경우 4자리 출력
           %b,%B : 논리값
           %n,\n : 줄바꿈
        */

        
        System.out.printf("%s,%d,%o,%x,%h,%f,%b,%tY\n", 
        "안녕", 100, 100, 100, 100, 3.14, true, new java.util.Date());
        
        //[.presicion]
        System.out.printf("%f, %.1f, %.2f, %.3f, %.4f, %.5f\n", 3.141592, 3.141592, 3.141592, 3.141592, 3.141592, 3.141592);
       
        //[argument_index$]
        System.out.printf("%1$f, %1$.1f, %1$.2f, %1$.3f, %1$.4f, %1$.5f\n "
        , 3.141592);
        //[width]
        System.out.printf("%1$4s,%1$10s,%2$5.2f,%2$10.3f\n", "홍길동", 3.14);
        //[flag]
        //왼쪽정렬 -
        System.out.printf("'%10s','%-10s'\n", "홍길동","가나다");
        //부호 출력
        System.out.printf("%d, %+d\n", 100, 100);
        //빈자리를 0으로 채우기
        System.out.printf("%5d, %05d\n", 123, 123);

        //날짜 : %t[접미사]
        // H : hour 00~23
        // I : hour 01~12
        // M : Minute 00~59
        // S : Second 00~60
        
        System.out.printf("%1$tH,%1$tI,%1$tM,%1$tS,%1$tp\n", 
        new java.util.Date());

        System.out.printf("%1$tH:%1$tM:%1$tS\n", new java.util.Date());

        System.out.printf("%1$tY,%1$ty,%1$tm,%1$td,%1$te\n", 
        new java.util.Date());

        System.out.printf("%1$tm,%1$tB,%1$tb\n", new java.util.Date());

        System.out.printf("%1$tA,%1$ta\n", new java.util.Date());        

    }
}
